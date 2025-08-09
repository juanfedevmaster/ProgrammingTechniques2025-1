/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.juanfedevmaster.webtableexample;

import Entidades.Vehiculo;
import LogicaNegocio.VehiculoServicio;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jufeq
 */
public class SvVehiculos extends HttpServlet {

    //protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String query = request.getQueryString();
        boolean tieneFiltros = false;

        if (query != null && !query.isBlank()) {
            tieneFiltros = true;
        }

        List<Vehiculo> vehiculos = new ArrayList<>();
        VehiculoServicio vehiculoServicio = new VehiculoServicio();

        try {
            if (tieneFiltros) {
                String filtros[] = request.getParameter("filtro").split(";");

                switch (filtros[0]) {
                    case "Brand":
                        vehiculos = vehiculoServicio.getVehiculos();

                        vehiculos = vehiculos.stream()
                                .filter(x -> x.getBrand().equals(filtros[1]))
                                .toList();
                        break;
                    case "Name":
                        vehiculos = vehiculoServicio.getVehiculos();

                        vehiculos = vehiculos.stream()
                                .filter(x -> x.getName().equals(filtros[1]))
                                .toList();
                        break;
                    case "Type":
                        vehiculos = vehiculoServicio.getVehiculos();

                        vehiculos = vehiculos.stream()
                                .filter(x -> x.getType().equals(filtros[1]))
                                .toList();
                        break;
                    case "Year Introduce":
                        vehiculos = vehiculoServicio.getVehiculos();

                        vehiculos = vehiculos.stream()
                                .filter(x -> x.getYearIntroduced() == Integer.parseInt(filtros[1]))
                                .toList();
                        break;
                    case "Editar":
                        vehiculos = vehiculoServicio.getVehiculos();

                        Vehiculo vehiculoFiltrado = vehiculos.stream()
                                .filter(x -> x.getName().equals(filtros[1]))
                                .findFirst().get();

                        request.setAttribute("vehiculoModificar", vehiculoFiltrado);
                        RequestDispatcher dispatcherEditar = request.getRequestDispatcher("actualizar_vehiculos.jsp");
                        dispatcherEditar.forward(request, response);

                        return;
                    case "Eliminar":
                        String nombre = request.getParameter("nombre");
                        String marca = request.getParameter("marca");
                        vehiculoServicio.deleteVehiculo(nombre, marca);

                        vehiculos = vehiculoServicio.getVehiculos();
                        break;
                }
            } else {
                vehiculos = vehiculoServicio.getVehiculos();
            }

            request.setAttribute("vehiculos", vehiculos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("vehiculos.jsp");

            dispatcher.forward(request, response);

        } catch (Exception ex) {
            Logger.getLogger(SvVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        boolean editar = (request.getParameter("editar") == null || request.getParameter("editar").isBlank()) ? false : true;

        VehiculoServicio vehiculoServicio = new VehiculoServicio();

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setBrand(request.getParameter("marca"));
        vehiculo.setName(request.getParameter("nombreVehiculo"));
        vehiculo.setType(request.getParameter("tipoVehiculo"));
        vehiculo.setYearIntroduced(Integer.parseInt(request.getParameter("yearIntroduccion")));

        if (!editar) {
            try {
                boolean resultado = vehiculoServicio.addVehiculo(vehiculo);
                if (resultado) {
                    System.out.println("Vehículo agregado correctamente");
                }
            } catch (Exception ex) {
                request.setAttribute("mensaje", "Error: " + ex.getMessage());
            }
        } else {
            Vehiculo vehiculoOriginal = new Vehiculo();
            vehiculoOriginal.setBrand(request.getParameter("marca-o"));
            vehiculoOriginal.setName(request.getParameter("nombreVehiculo-o"));
            vehiculoOriginal.setType(request.getParameter("tipoVehiculo-o"));
            vehiculoOriginal.setYearIntroduced(Integer.parseInt(request.getParameter("yearIntroduccion-o")));

            try {
                boolean resultado = vehiculoServicio.updateVehiculo(vehiculo, vehiculoOriginal);
                if (resultado) {
                    System.out.println("Vehículo modificado correctamente");
                }
            } catch (Exception ex) {
                request.setAttribute("mensaje", "Error: " + ex.getMessage());
            }
        }

        response.sendRedirect("SvVehiculos");

    }
}

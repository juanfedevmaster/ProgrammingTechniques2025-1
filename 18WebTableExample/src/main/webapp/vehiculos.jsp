<%-- 
    Document   : vehiculos
    Created on : 13/06/2025, 7:26:23 p. m.
    Author     : jufeq
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vehiculos MongoDB</title>
        <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
        <script src="https://cdn.datatables.net/2.3.2/js/dataTables.js"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/2.3.2/css/dataTables.dataTables.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    </head>
    <body>
        <div class="container text-center mt-5">
            <div class="row">
                <div class="col">

                </div>
                <div class="col-12">
                    <% List<Vehiculo> vehiculos = (List<Vehiculo>) request.getAttribute("vehiculos");%>
                    <table id="example" class="display">
                        <thead>
                            <tr>
                                <th>Brand</th>
                                <th>Name</th>
                                <th>Type</th>
                                <th>Year Introduced</th>
                                <th style="text-align: center">Actions</th>
                            </tr>
                        <tbody>
                            <%for (Vehiculo vehiculo : vehiculos) {%>
                            <tr>
                                <td>
                                    <%= vehiculo.getBrand()%>
                                </td>
                                <td>
                                    <%= vehiculo.getName()%>
                                </td>
                                <td>
                                    <%= vehiculo.getType()%>
                                </td>
                                <td>
                                    <%= vehiculo.getYearIntroduced()%>
                                </td>
                                <td>
                                    <a class="btn btn-primary" href="SvVehiculos?filtro=Editar;<%= vehiculo.getName()%>" role="button">Editar</a>
                                    <a class="btn btn-danger" href="#" role="button">Eliminar</a>
                                </td>
                            </tr>                
                            <% }%>
                        </tbody>
                        <tfoot>
                            <tr>
                                <th>Brand</th>
                                <th>Name</th>
                                <th>Type</th>
                                <th>Year Introduced</th>
                                <th style="text-align: center">Actions</th>
                            </tr>
                        </tfoot>
                        </thead>
                    </table>

                </div>
                <div class="col">

                </div>
            </div>
            <div>
                <div class="col-12 text-end">
                    <a class="btn btn-primary" href="registro_vehiculos.jsp">Nuevo Vehículo</a>
                    <!--<button type="button" onclick="window.location.href='nuevoVehiculo.jsp'" class="btn btn-primary">Nuevo Vehículo</button>-->
                </div>
            </div>
        </div>
        <script>
            new DataTable('#example');
        </script>
    </body>
</html>

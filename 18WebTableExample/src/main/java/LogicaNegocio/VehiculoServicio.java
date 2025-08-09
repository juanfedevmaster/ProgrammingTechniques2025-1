/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import Entidades.Vehiculo;
import Persistencia.VehiculoRepositorio;
import java.util.ArrayList;

/**
 *
 * @author jufeq
 */
public class VehiculoServicio {
    private final VehiculoRepositorio vehiculoRepositorio;

    public VehiculoServicio() {
        vehiculoRepositorio = new VehiculoRepositorio();
    }
    
    public ArrayList<Vehiculo> getVehiculos() throws Exception{
        return vehiculoRepositorio.getVehiculos();
    }

    public boolean addVehiculo(Vehiculo vehiculo) throws Exception {
        
        if (!vehiculoValido(vehiculo)) {
            return false;
        }

        return vehiculoRepositorio.addVehiculo(vehiculo);
    }
    
    public boolean updateVehiculo(Vehiculo vehiculo, Vehiculo vehiculoOriginal) throws Exception {
        
        if (!vehiculoValido(vehiculo)) {
            return false;
        }

        return vehiculoRepositorio.updateVehiculo(vehiculo, vehiculoOriginal);
    }
    
    public boolean deleteVehiculo(String nombre, String marca) throws Exception{
        
        if (nombre.isBlank() || marca.isBlank()) {
            throw new IllegalArgumentException("La marca del vehículo no puede ser nula o vacia");
        }
        return vehiculoRepositorio.deleteVehiculo(nombre,marca);
    }


    private boolean vehiculoValido(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }

        if (vehiculo.getBrand() == null || vehiculo.getBrand().isBlank()) {
            throw new IllegalArgumentException("La marca del vehículo no puede ser nula o vacia");
        }

        if (vehiculo.getType() == null || vehiculo.getType().isBlank()) {
            throw new IllegalArgumentException("El tipo del vehículo no puede ser nulo o vacio");
        }

        if (vehiculo.getYearIntroduced() == 0 || vehiculo.getYearIntroduced() < 1886) {
            throw new IllegalArgumentException("El año del vehículo no puede ser nulo o vacio");
        }

        if (vehiculo.getName() == null || vehiculo.getName().isBlank()) {
            throw new IllegalArgumentException("El nombre del vehículo debe ser no puede ser nulo o vacio");
        }

        return true;
    }
}

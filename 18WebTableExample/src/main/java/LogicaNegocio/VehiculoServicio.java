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
}

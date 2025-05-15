/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13.loginexamplewithfiles;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import loginexample.Entities.Accesorio;

/**
 *
 * @author jufeq
 */
public class ModelAccesoriosTable extends AbstractTableModel {

    ArrayList<Accesorio> listAccesorios;
    String[] columns = {"Codigo Accesorio", "Nombre", "Disponible/Cant.", "Material"};

    public ModelAccesoriosTable(ArrayList<Accesorio> listAccesorios) {
        this.listAccesorios = listAccesorios;
    }
    
    public void AddAccesorio(Accesorio accesorio){
        if(this.listAccesorios == null)
            this.listAccesorios = new ArrayList<>();
        
        this.listAccesorios.add(accesorio);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listAccesorios.size();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        return columns.length;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var accesorio = this.listAccesorios.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                accesorio.getCodigo();
            case 1 ->
                accesorio.getNombre();
            case 2 ->
                accesorio.getCantidad();
            case 3 ->
                accesorio.getMaterial();
            default ->
                accesorio;
        };
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    @Override
    public String getColumnName(int column) {
        return this.columns[column];
    }
}

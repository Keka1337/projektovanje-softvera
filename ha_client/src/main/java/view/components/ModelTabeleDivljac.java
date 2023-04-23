/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.components;

import domain.Divljac;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jelena
 */
public class ModelTabeleDivljac extends AbstractTableModel{

    String[] naziviKolona = {"Naziv", "Latinski Naziv"};
    List<Divljac> listaDivljaci;

    public ModelTabeleDivljac() {
        listaDivljaci = new ArrayList<>();
    }

    public ModelTabeleDivljac(ArrayList<Divljac> listaDivljaci) {
        this.listaDivljaci = listaDivljaci;
    }

    public List<Divljac> getListaDivljaci() {
        return listaDivljaci;
    }

    public void setListaDivljaci(ArrayList<Divljac> listaDivljaci) {
        this.listaDivljaci = listaDivljaci;
    }

    @Override
    public int getRowCount() {
        return listaDivljaci.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Divljac d = listaDivljaci.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return d.getNaziv();
            case 1:
                return d.getLatinskiNaziv();
            default:
                return null;
        }
    }
    
}

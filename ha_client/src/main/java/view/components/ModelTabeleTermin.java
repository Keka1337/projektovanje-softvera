/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.components;

import domain.Termin;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jelena
 */
public class ModelTabeleTermin extends AbstractTableModel {

    String[] naziviKolona = {"Datum","Divljac"};
    List<Termin> listaTermina;

    public ModelTabeleTermin() {
        listaTermina = new ArrayList<>();
    }

    public ModelTabeleTermin(List<Termin> listaTermina) {
        this.listaTermina = listaTermina;
    }

    public List<Termin> getListaTermina() {
        return listaTermina;
    }

    public void setListaTermina(List<Termin> listaTermina) {
        this.listaTermina = listaTermina;
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }   
    
    @Override
    public int getRowCount() {
        return listaTermina.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Termin termin = listaTermina.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return termin.getDatum();
            case 1:
                return termin.getDivljac().getNaziv();
            default:
                return null;
        }
    }
    
}

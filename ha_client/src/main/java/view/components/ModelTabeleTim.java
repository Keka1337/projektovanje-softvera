/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.components;

import domain.Tim;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jelena
 */
public class ModelTabeleTim extends AbstractTableModel {

    String[] naziviKolona = {"Naziv"};
    List<Tim> listaTimova;

    public ModelTabeleTim() {
        listaTimova = new ArrayList<>();
    }

    public ModelTabeleTim(List<Tim> listaTimova) {
        this.listaTimova = listaTimova;
    }

    public List<Tim> getListaTimova() {
        return listaTimova;
    }

    public void setListaTimova(List<Tim> listaTimova) {
        this.listaTimova = listaTimova;
    }

    @Override
    public int getRowCount() {
        return listaTimova.size();
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
        Tim tim = listaTimova.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tim.getNaziv();
            default:
                return null;
        }
    }

    public Tim vratiIzabraniTim(int red) {
        return listaTimova.get(red);
    }

}

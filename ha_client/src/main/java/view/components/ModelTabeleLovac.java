/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.components;

import domain.Lovac;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jelena
 */
public class ModelTabeleLovac extends AbstractTableModel{

    String[] naziviKolona = {"Ime", "Prezike","JMBG","Tim","Broj clanske karte", "Naziv tima"};
    List<Lovac> listaLovaca;

    public ModelTabeleLovac() {
        listaLovaca = new ArrayList<>();
    }

    public ModelTabeleLovac(List<Lovac> listaLovaca) {
        this.listaLovaca = listaLovaca;
    }

    public List<Lovac> getListaLovaca() {
        return listaLovaca;
    }

    public void setListaLovaca(List<Lovac> listaLovaca) {
        this.listaLovaca = listaLovaca;
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }
    
    @Override
    public int getRowCount() {
        return listaLovaca.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lovac lovac = listaLovaca.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return lovac.getIme();
            case 1:
                return lovac.getPrezime();
            case 2:
                return lovac.getJMBG();
            case 3:
                return lovac.getTim().getNaziv();
            case 4:
                return lovac.getClanskaKarta().getBrojClanskeKarte();
            case 5:
                return lovac.getTim().getNaziv();
            default:
                return null;
        }
    }

    public Lovac vratiIzabranogLovca(int red) {
        return listaLovaca.get(red);
    }
    
}

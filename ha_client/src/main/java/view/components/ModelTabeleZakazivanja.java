/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.components;

import domain.Zakazivanje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jelena
 */
public class ModelTabeleZakazivanja extends AbstractTableModel {

    String[] naziviKolona = {"Tim", "Datum", "Divljac", "Odobreno"};
    List<Zakazivanje> listaZakazivanja;

    public ModelTabeleZakazivanja() {
        listaZakazivanja = new ArrayList<>();
    }

    public ModelTabeleZakazivanja(List<Zakazivanje> listaZakazivanja) {
        this.listaZakazivanja = listaZakazivanja;
    }

    public List<Zakazivanje> getListaZakazivanja() {
        return listaZakazivanja;
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public void setListaZakazivanja(List<Zakazivanje> listaZakazivanja) {
        this.listaZakazivanja = listaZakazivanja;
    }
    
    @Override
    public int getRowCount() {
        return listaZakazivanja.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zakazivanje zakazivanje = listaZakazivanja.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return zakazivanje.getTim().getNaziv();
            case 1:
                return zakazivanje.getTermin().getDatum();
            case 2:
                return zakazivanje.getTermin().getDivljac();
            case 3:
                return zakazivanje.isOdobreno() ? "APPROVED" : "CANCELLED";
            default:
                return null;
        }
    }
    
    public Zakazivanje vratiIzabranoZakazivanje(int selectedRow){
        return listaZakazivanja.get(selectedRow);
    }
    
}

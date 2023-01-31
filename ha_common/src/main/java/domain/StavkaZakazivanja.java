/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import exception.ValidationException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jelena
 */
public class StavkaZakazivanja implements GenericEntity {

    int redniBroj;
    Zakazivanje zakazivanje;
    String naziv;
    Termin termin;

    public StavkaZakazivanja() {
    }

    public StavkaZakazivanja(int redniBroj, Zakazivanje Zakazivanje, String naziv, Termin termin) {
        this.redniBroj = redniBroj;
        this.zakazivanje = Zakazivanje;
        this.naziv = naziv;
        this.termin = termin;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redbiBroj) {
        this.redniBroj = redbiBroj;
    }

    public Zakazivanje getZakazivanje() {
        return zakazivanje;
    }

    public void setZakazivanje(Zakazivanje Zakazivanje) {
        if (zakazivanje == null) {
            throw new ValidationException("Vrednost ne moze biti prazna!");
        }
        this.zakazivanje = Zakazivanje;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        if (termin == null) {
            throw new ValidationException("Vrednost ne moze biti prazna!");
        }
        this.termin = termin;
    }

    @Override
    public String toString() {
        return "StavkaZakazivanja{" + "redniBroj=" + redniBroj + ", Zakazivanje=" + zakazivanje + ", naziv=" + naziv + ", termin=" + termin + '}';
    }

    @Override
    public String getTableName() {
        return "stavka_zakazivanja";
    }

    @Override
    public String getColumnNamesForInsert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getInsertValues() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getWhereClauseDeleteEdit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColumnNamesForGetAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getJoinClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getWhereForGetAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getOrderByClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

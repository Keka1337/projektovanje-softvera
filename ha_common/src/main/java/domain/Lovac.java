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
public class Lovac implements GenericEntity {

    Long lovacID;
    String ime;
    String prezime;
    String JMBG;
    Tim tim;
    ClanskaKarta clanskaKarta;

    public Lovac() {
    }

    public Lovac(Long lovacId, String ime, String prezime, String JMBG, Tim tim, ClanskaKarta clanskaKarta) {
        this.lovacID = lovacId;
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.tim = tim;
        this.clanskaKarta = clanskaKarta;
    }

    public Lovac(Long lovacId) {
        this.lovacID = lovacId;
    }

    public Long getLovacID() {
        return lovacID;
    }

    public void setLovacID(Long lovacID) {
        this.lovacID = lovacID;
    }

    public Tim getTim() {
        return tim;
    }

    public void setTim(Tim tim) {
        this.tim = tim;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }

    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        if (clanskaKarta == null) {
            throw new ValidationException("Lovac mora imati clansku katrtu!");
        }
        this.clanskaKarta = clanskaKarta;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if (ime.isEmpty()) {
            throw new ValidationException("Lovac mora imati uneto ime!");
        }
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if (prezime.isEmpty()) {
            throw new ValidationException("Lovac mora imati uneto prezime!");
        }
        this.prezime = prezime;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        if (JMBG.isEmpty()) {
            throw new ValidationException("JMBG mora biti unet!");
        }
        if (JMBG.trim().length() < 13) {
            throw new ValidationException("JMBG mora imati 13 karaktera!");
        }
        this.JMBG = JMBG;
    }

    @Override
    public String toString() {
        return "Lovac{" + "lovacID=" + lovacID + ", ime=" + ime + ", prezime=" + prezime + ", JMBG=" + JMBG + ", tim=" + tim + ", clanskaKarta=" + clanskaKarta + '}';
    }

    @Override
    public String getTableName() {
        return "lovac";
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

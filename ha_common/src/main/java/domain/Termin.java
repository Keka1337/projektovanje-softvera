/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import exception.ValidationException;
import helper.DateFormatter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Jelena
 */
public class Termin implements GenericEntity {

    Long terminID;
    Date datum;
    Divljac divljac;

    public Termin() {
    }

    public Termin(Long terminId, Date datum, Divljac divljac) {
        this.terminID = terminId;
        this.datum = datum;
        this.divljac = divljac;
    }

    public Termin(Long terminId) {
        this.terminID = terminId;
    }

    public Long getId() {
        return terminID;
    }

    public void setId(Long id) {
        this.terminID = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        if (datum == null) {
            throw new ValidationException("Termin mora imati datum!");
        }
        this.datum = datum;
    }

    public Divljac getDivljac() {
        return divljac;
    }

    public void setDivljac(Divljac divljac) {
        if (datum == null) {
            throw new ValidationException("Termin mora imati divljac!");
        }
        this.divljac = divljac;
    }

    @Override
    public String toString() {
        return "Termin{" + "id=" + terminID + ", datum=" + datum + ", divljac=" + divljac + '}';
    }

    @Override
    public String getTableName() {
        return "termin";
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

}

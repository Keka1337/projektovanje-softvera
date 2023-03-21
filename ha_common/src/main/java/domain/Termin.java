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

    public Long getTerminID() {
        return terminID;
    }

    public void setTerminID(Long terminID) {
        this.terminID = terminID;
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
        return "terminID, datum, divljacID";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        return sb.append(terminID).append(",")
                .append(datum).append(",")
                .append(divljac.getDivljacID()).toString();
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        StringBuilder sb = new StringBuilder();
        return sb.append("terminID =").append(terminID)
                .append(",").append("datum =").append(datum)
                .append(",").append("divljacID =")
                .append(divljac.getDivljacID()).toString();
    }

    @Override
    public String getWhereClauseDeleteEdit() {
        return "terminID = " + terminID + " ";
    }

    @Override
    public String getColumnNamesForGetAll() {
        return "terminID, datum, divljacID, naziv, latinskiNaziv";
    }

    @Override
    public String getJoinClause() {
        return "t join divljac d t.divljacID = d.divljacID";
    }

    @Override
    public String getWhereForGetAll() {
        return "";
    }

    @Override
    public String getOrderByClause() {
        return "order by t.datum";
    }

    @Override
    public void setId(Long id) {
        terminID = id;
    }

}

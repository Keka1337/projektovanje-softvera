/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

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
        this.datum = datum;
    }

    public Divljac getDivljac() {
        return divljac;
    }

    public void setDivljac(Divljac divljac) {
        this.divljac = divljac;
    }

    @Override
    public String toString() {
        return datum + ", " + divljac.getNaziv();
    }

    @Override
    public String getTableName() {
        return "termin";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "datum, divljacID";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        return sb.append("'")
                .append(new java.sql.Date(datum.getTime())).append("',")
                .append(divljac.getDivljacID()).toString();
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        StringBuilder sb = new StringBuilder();
        return sb.append(",").append("datum =").append(new java.sql.Date(datum.getTime()))
                .append(",").append("divljacID =")
                .append(divljac.getDivljacID()).toString();
    }

    @Override
    public String getWhereClauseDeleteEdit() {
        return "terminID = " + terminID + " ";
    }

    @Override
    public String getColumnNamesForGetAll() {
        return "t.terminID, t.datum, d.divljacID, d.naziv, d.latinskiNaziv";
    }

    @Override
    public String getJoinClause() {
        return " t join divljac d on t.divljacID = d.divljacID ";
    }

    @Override
    public String getWhereForGetAll() {
        return "";
    }

    @Override
    public String getOrderByClause() {
        return " order by t.datum ";
    }

    @Override
    public void setId(Long id) {
        terminID = id;
    }

}

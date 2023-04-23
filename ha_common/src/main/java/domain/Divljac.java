/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Jelena
 */
public class Divljac implements GenericEntity {

    Long divljacID;
    String naziv;
    String latinskiNaziv;

    public Divljac() {
    }

    public Divljac(Long divljacID, String naziv) {
        this.divljacID = divljacID;
        this.naziv = naziv;
    }

    public Divljac(Long divljacID, String naziv, String latinskiNaziv) {
        this.divljacID = divljacID;
        this.naziv = naziv;
        this.latinskiNaziv = latinskiNaziv;
    }

    public String getLatinskiNaziv() {
        return latinskiNaziv;
    }

    public void setLatinskiNaziv(String latinskiNaziv) {
        this.latinskiNaziv = latinskiNaziv;
    }

    public Long getDivljacID() {
        return divljacID;
    }

    public void setDivljacID(Long divljacID) {
        this.divljacID = divljacID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return  naziv;
    }

    @Override
    public String getTableName() {
        return "divljac";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "naziv, latinskiNaziv";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        return sb.append("'").append(naziv)
                .append("','").append(latinskiNaziv)
                .append("'").toString();
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        return "";
    }

    @Override
    public String getWhereClauseDeleteEdit() {
        return "";
    }

    @Override
    public String getColumnNamesForGetAll() {
        return "divljacID, naziv, latinskiNaziv";
    }

    @Override
    public String getJoinClause() {
        return "";
    }

    @Override
    public String getWhereForGetAll() {
        return "";
    }

    @Override
    public String getOrderByClause() {
        return " order by naziv";
    }

    @Override
    public void setId(Long id) {
        divljacID = id;
    }

}

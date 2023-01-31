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

    public Divljac(Long divljacID, String naziv, String latinskiNaziv) {
        this.divljacID = divljacID;
        this.naziv = naziv;
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

    public String getLatinskiNaziv() {
        return latinskiNaziv;
    }

    public void setLatinskiNaziv(String latinskiNaziv) {
        this.latinskiNaziv = latinskiNaziv;
    }

    @Override
    public String toString() {
        return "Divljac{" + "divljacID=" + divljacID + ", naziv=" + naziv + ", latinskiNaziv=" + latinskiNaziv + '}';
    }

    @Override
    public String getTableName() {
        return "divljac";
    }

    @Override
    public String getColumnNamesForInsert() {
                return "ime, prezime, username, password";    
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        return sb.append(divljacID).append(",")
                .append("'").append(naziv).append("',")
                .append("'").append(latinskiNaziv).append("',").toString();
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        StringBuilder sb = new StringBuilder();
        return sb.append("ime ='").append(naziv).append("', ")
          .append("prezime ='").append(latinskiNaziv).append("', ").toString();
    }

    @Override
    public String getWhereClauseDeleteEdit() {
        return "divljacID = " + divljacID;
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
        return "order by divljacID";
    }

    @Override
    public void setId(Long id) {
        divljacID = id;
    }

    
}
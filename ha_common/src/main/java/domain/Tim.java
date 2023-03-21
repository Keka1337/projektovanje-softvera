/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jelena
 */
public class Tim implements GenericEntity {

    Long timID;
    String naziv;
    int brojLovljenja;

    public Tim() {
    }

    public Tim(Long timId) {
        this.timID = timId;
    }

    public Tim(String naziv, int brojLovljenja) {
        this.naziv = naziv;
        this.brojLovljenja = brojLovljenja;
    }

    public Tim(Long timId, String naziv, int brojLovljenja) {
        this.timID = timId;
        this.naziv = naziv;
        this.brojLovljenja = brojLovljenja;
    }

    public String getNaziv() {
        return naziv;
    }

    public Long getTimID() {
        return timID;
    }

    public void setTimID(Long timID) {
        this.timID = timID;
    }

    public String getNazivTima() {
        return naziv;
    }

    public void setNazivTima(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojLovljenja() {
        return brojLovljenja;
    }

    public void setBrojLovljenja(int brojLovljenja) {
        this.brojLovljenja = brojLovljenja;
    }

    @Override
    public String toString() {
        return "Tim{" + "timID=" + timID + ", naziv=" + naziv + ", brojLovljenja=" + brojLovljenja + '}';
    }

    @Override
    public String getTableName() {
        return "tim";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "timID,nazivTima,brojLovljenja";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        return sb.append(timID).append(",")
                .append("'").append(naziv).append("',")
                .append(brojLovljenja).append(",")
                .toString();
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        StringBuilder sb = new StringBuilder();
        return sb.append("naziv ='").append(naziv).append("', ")
                .append("brojLovljenja =").append(brojLovljenja)
                .toString();
    }

    @Override
    public String getWhereClauseDeleteEdit() {
        return "timID=" + timID;
    }

    @Override
    public String getColumnNamesForGetAll() {
        return "timID, naziv, brojLovljenja";
    }

    @Override
    public String getJoinClause() {
        return "";
    }

    @Override
    public String getWhereForGetAll() {
        return "timID, naziv, brojLovljenja";
    }

    @Override
    public String getOrderByClause() {
        return "order by timID";
    }

    @Override
    public void setId(Long id) {
        timID = id;
    }

}

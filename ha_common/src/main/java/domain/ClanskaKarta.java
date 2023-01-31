/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import helper.DateFormatter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Jelena
 */
public class ClanskaKarta implements GenericEntity {

    Long brojClanskeKarte;
    Date datumUplate;
    Date datumIsteka;
    Double clanarina;

    public ClanskaKarta() {
    }

    public ClanskaKarta(Long brojClanskeKarte, Date datumUplate, Double clanarina) {
        this.brojClanskeKarte = brojClanskeKarte;
        this.datumUplate = datumUplate;
        this.clanarina = clanarina;
    }

    public ClanskaKarta(Date datumUplate, Double clanarina) {
        this.datumUplate = datumUplate;
        this.datumIsteka = DateFormatter.odrediDatumIsteka(datumUplate);
        this.clanarina = clanarina;
    }

    public ClanskaKarta(Long brojClanskeKarte) {
        this.brojClanskeKarte = brojClanskeKarte;
    }

    public void setBrojClanskeKarte(Long brojClanskeKarte) {
        this.brojClanskeKarte = brojClanskeKarte;
    }

    public Long getBrojClanskeKarte() {
        return brojClanskeKarte;
    }

    public Date getDatumUplate() {
        return datumUplate;
    }

    public void setDatumUplate(Date datumUplate) {
        this.datumUplate = datumUplate;
    }

    public Date getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public Double getClanarina() {
        return clanarina;
    }

    public void setClanarina(Double clanarina) {
        this.clanarina = clanarina;
    }

    @Override
    public String toString() {
        return "ClanskaKarta{" + "brojClanskeKarte=" + brojClanskeKarte + ", datumUplate=" + datumUplate + ", datumIsteka=" + datumIsteka + ", clanarina=" + clanarina + '}';
    }

    @Override
    public String getTableName() {
        return "clanska_karta";
    }

    @Override
    public String getColumnNamesForInsert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        return sb.append(brojClanskeKarte).append(",")
                .append("'").append(datumUplate).append("',")
                .append("'").append(datumIsteka).append("',")
                .append("'").append(clanarina).append("',").toString();
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        StringBuilder sb = new StringBuilder();
        return sb.append("datumUplate ='").append(datumUplate).append("', ")
                .append("datumIsteka ='").append(datumIsteka).append("', ")
                .append("clanarina ='").append(clanarina).append("', ").toString();
    }

    @Override
    public String getWhereClauseDeleteEdit() {
        return "brojClanskeKarte = " + brojClanskeKarte;
    }

    @Override
    public String getColumnNamesForGetAll() {
        return "brojClanskeKarte, datumUplate, datumIsteka, clanarina";
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
        return "order by brojClanskeKarte";
    }

    @Override
    public void setId(Long id) {
        brojClanskeKarte = id;
    }

}

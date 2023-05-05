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
public class ClanskaKarta implements GenericEntity {

    Long brojClanskeKarte;
    Date datumUplate;
    Date datumIsteka;
    Double clanarina;

    public ClanskaKarta() {
    }

    public ClanskaKarta(Long brojClanskeKarte, Date datumUplate, Date datumIsteka, Double clanarina) {
        this.brojClanskeKarte = brojClanskeKarte;
        this.datumUplate = datumUplate;
        this.datumIsteka = datumIsteka;
        this.clanarina = clanarina;
    }

    public Long getBrojClanskeKarte() {
        return brojClanskeKarte;
    }

    public void setBrojClanskeKarte(Long brojClanskeKarte) {
        this.brojClanskeKarte = brojClanskeKarte;
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
        return "datumUplate, datumIsteka, clanarina";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        return sb.append("'").append(new java.sql.Date(datumUplate.getTime())).append("',")
                .append("'").append(new java.sql.Date(datumIsteka.getTime())).append("',")
                .append(clanarina)
                .toString();
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        StringBuilder sb = new StringBuilder();
        return sb.append("datumUplate ='").append(new java.sql.Date(datumUplate.getTime())).append("', ")
                .append("datumIsteka ='").append(new java.sql.Date(datumIsteka.getTime())).append("', ")
                .append("clanarina =").append(clanarina).append(", ").toString();
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

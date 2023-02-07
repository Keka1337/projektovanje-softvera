/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Jelena
 */
public class Zaposleni implements GenericEntity {

    private Long zaposleniID;
    private String ime;
    private String prezime;
    private String username;
    private String password;

    public Zaposleni() {
    }

    public Zaposleni(Long zaposleniID, String ime, String prezime, String username, String password) {
        this.zaposleniID = zaposleniID;
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
    }

    public Long getZaposleniID() {
        return zaposleniID;
    }

    public void setZaposleniID(Long zaposleniID) {
        this.zaposleniID = zaposleniID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Zaposleni{" + "zaposleniID=" + zaposleniID + ", ime=" + ime + ", prezime=" + prezime + ", username=" + username + ", password=" + password + '}';
    }

    
    @Override
    public String getTableName() {
        return "zaposleni";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "zaposleniIDs, ime, prezime, username, password";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        sb.append(zaposleniID).append(",")
                .append("'").append(ime).append("',")
                .append("'").append(prezime).append("',")
                .append("'").append(username).append("',")
                .append("'").append(password).append("'");
        return sb.toString();
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("ime ='").append(ime).append("', ")
                .append("prezime ='").append(prezime).append("', ")
                .append("username ='").append(username).append("', ")
                .append("password ='").append(password).append("'");
        return sb.toString();
    }

    @Override
    public String getWhereClauseDeleteEdit() {
        return "zaposleniID=" + zaposleniID;
    }

    @Override
    public String getColumnNamesForGetAll() {
        return "zaposleniID, ime, prezime, username, password";
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
        return "order by zaposleniID asc";
    }

    @Override
    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

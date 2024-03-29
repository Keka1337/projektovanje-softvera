/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;


/**
 *
 * @author Jelena
 */
public class Zakazivanje implements GenericEntity {

    Tim tim;
    Termin termin;
    boolean odobreno;

    public Zakazivanje() {
    }

    public Zakazivanje(boolean odobreno, Tim tim, Termin termin) {
        this.odobreno = odobreno;
        this.tim = tim;
        this.termin = termin;
    }

    public boolean isOdobreno() {
        return odobreno;
    }

    public void setOdobreno(boolean odobreno) {
        this.odobreno = odobreno;
    }

    public Tim getTim() {
        return tim;
    }

    public void setTim(Tim tim) {
        this.tim = tim;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }

    @Override
    public String toString() {
        return "Zakazivanje{" + ", odobreno=" + odobreno + ", tim=" + tim + ", termin=" + termin + '}';
    }

    @Override
    public String getTableName() {
        return "zakazivanje";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "timID, terminID, odobreno";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        return sb.append(tim.getTimID())
                .append(",").append(termin.getTerminID())
                .append(",").append(odobreno).toString();
    }

    @Override
    public String getColumnNamesValuesUpdate() {
        StringBuilder sb = new StringBuilder();
        return sb.append("odobreno =").append(odobreno).toString();
    }

    @Override
    public String getWhereClauseDeleteEdit() {
        return "timID = " + tim.getTimID() + " AND terminID =  " + termin.getTerminID();
    }

    @Override
    public String getColumnNamesForGetAll() {
        return "t.timID, t.naziv, tr.terminID, tr.datum, d.divljacID, d.naziv, d.latinskiNaziv, z.odobreno";
    }

    @Override
    public String getJoinClause() {
        return "z join tim t on z.timID=t.timID join termin tr  on z.terminID = tr.terminID join divljac d on d.divljacID=tr.divljacID";
    }

    @Override
    public String getWhereForGetAll() {
//        StringBuilder sb = new StringBuilder();
//        return sb.append("where z.timID=").append(tim.getTimID()).toString();
        return "";
    }

    @Override
    public String getOrderByClause() {
        return "order by t.timID, tr.terminID";
    }

    @Override
    public void setId(Long id) {
    }

}

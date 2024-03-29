/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db;

import domain.ClanskaKarta;
import domain.Divljac;
import domain.GenericEntity;
import domain.Lovac;
import domain.Termin;
import domain.Tim;
import domain.Zakazivanje;
import domain.Zaposleni;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jelena
 */
public class Mapper {

    public static GenericEntity map(GenericEntity entity, ResultSet rs) throws SQLException {
        if (entity instanceof Zaposleni) {
            return new Zaposleni(
                    rs.getLong("zaposleniID"),
                    rs.getString("ime"),
                    rs.getString("prezime"),
                    rs.getString("username"),
                    rs.getString("password"));
        }
        if (entity instanceof Lovac) {
            Tim tim = new Tim(
                    rs.getLong("t.timID"),
                    rs.getString("t.naziv"));
            ClanskaKarta clanskaKarta = new ClanskaKarta(
                    rs.getLong("ck.brojClanskeKarte"),
                    rs.getDate("ck.datumUplate"),
                    rs.getDate("ck.datumIsteka"),
                    rs.getDouble("ck.clanarina"));
            return new Lovac(
                    rs.getLong("l.lovacID"),
                    rs.getString("l.ime"),
                    rs.getString("l.prezime"),
                    rs.getString("l.JMBG"),
                    tim,
                    clanskaKarta);
        }
        if (entity instanceof ClanskaKarta) {
            return new ClanskaKarta(
                    rs.getLong("brojClanskeKarte"),
                    rs.getDate("datumUplate"),
                    rs.getDate("datumIsteka"),
                    rs.getDouble("clanarina"));
        }
        if (entity instanceof Tim) {
            return new Tim(
                    rs.getLong("timID"),
                    rs.getString("naziv"));
        }
        if (entity instanceof Termin) {
            Divljac divljac = new Divljac(
                    rs.getLong("d.divljacID"),
                    rs.getString("d.naziv"),
                    rs.getString("d.latinskiNaziv"));
            return new Termin(rs.getLong("t.terminID"),
                    rs.getDate("t.datum"),
                    divljac
            );
        }
        if (entity instanceof Divljac) {
            return new Divljac(
                    rs.getLong("divljacID"),
                    rs.getString("naziv"),
                    rs.getString("latinskiNaziv"));
        }
        if (entity instanceof Zakazivanje) {
            Tim tim = new Tim(
                    rs.getLong("t.timID"),
                    rs.getString("t.naziv"));
            Divljac divljac = new Divljac(
                    rs.getLong("d.divljacID"),
                    rs.getString("d.naziv"),
                    rs.getString("d.latinskiNaziv"));
            Termin termin = new Termin(rs.getLong("tr.terminID"),
                    rs.getDate("tr.datum"),
                    divljac
            );
            return new Zakazivanje(
                    rs.getBoolean("odobreno"),
                    tim,
                    termin);
        }
        return null;
    }

}

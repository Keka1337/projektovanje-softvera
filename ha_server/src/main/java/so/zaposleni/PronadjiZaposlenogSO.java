/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.zaposleni;

import domain.Zaposleni;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class PronadjiZaposlenogSO extends AbstractSO {

    ArrayList<Zaposleni> zaposleniList;

    @Override
    protected void precondition(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        zaposleniList = (ArrayList<Zaposleni>) repository.getAll((Zaposleni) param);
    }

    public Zaposleni pronadjiZaposlenig(Zaposleni zaposleni) throws Exception {
        for (Zaposleni z : zaposleniList) {
            if (z.getUsername().equals(zaposleni.getUsername()) && z.getPassword().equals(zaposleni.getPassword())) {
                return z;
            }
        }
        throw new Exception("Sistem ne moze da pronadje zaposlenog po zadatoj vrednosti!");
    }

}

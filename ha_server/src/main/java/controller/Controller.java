/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Lovac;
import domain.Termin;
import domain.Tim;
import domain.Zaposleni;
import so.AbstractSO;
import so.lovac.ZapamtiLovcaSO;
import so.termin.ZapamtiTerminSO;
import so.tim.ZapamtiTimSO;
import so.zaposleni.PronadjiZaposlenogSO;

/**
 *
 * @author Jelena
 */
public class Controller {

    private static Controller instance;

    private Controller() {

    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Zaposleni pronadjiZaposlenog(Zaposleni zaposleni) throws Exception {
        AbstractSO operation = new PronadjiZaposlenogSO();
        operation.execute(new Zaposleni());
        System.out.println(zaposleni);
        Zaposleni ulogovaniZaposleni = ((PronadjiZaposlenogSO) operation).pronadjiZaposlenig(zaposleni);
        return ulogovaniZaposleni;
    }

    public void zapamtiLovca(Lovac lovac) throws Exception {
        AbstractSO operation = new ZapamtiLovcaSO();
        operation.execute(lovac);
    }

    public void zapamtiTim(Tim tim) throws Exception {
        AbstractSO operation = new ZapamtiTimSO();
        operation.execute(tim);
    }

    public void zapamtiTermin(Termin termin) throws Exception {
        AbstractSO operation = new ZapamtiTerminSO();
        operation.execute(termin);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.ClanskaKarta;
import domain.Divljac;
import domain.Lovac;
import domain.Termin;
import domain.Tim;
import domain.Zakazivanje;
import domain.Zaposleni;
import java.util.ArrayList;
import java.util.List;
import so.AbstractSO;
import so.clanskaKarta.UcitajClanskuKartuSO;
import so.clanskaKarta.ZapamtiClanskuKartuSO;
import so.divljac.UcitajDivljacSO;
import so.divljac.UcitajListuDivljaciSO;
import so.divljac.ZapamtiDivljacSO;
import so.lovac.IzmeniLovcaSO;
import so.lovac.UcitajListuLovacaSO;
import so.lovac.UcitajLovcaSO;
import so.lovac.ZapamtiLovcaSO;
import so.termin.UcitajListuTerminaSO;
import so.termin.ZapamtiTerminSO;
import so.tim.IzmeniTimSO;
import so.tim.UcitajListuTimovaSO;
import so.tim.UcitajTimSO;
import so.tim.ZapamtiTimSO;
import so.zakazivanje.OtkaziSO;
import so.zakazivanje.UcitajListuZakazivanjaSO;
import so.zakazivanje.ZakaziSO;
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

    public void zapamtiClanskuKartu(ClanskaKarta clanskaKarta) throws Exception {
        AbstractSO operation = new ZapamtiClanskuKartuSO();
        operation.execute(clanskaKarta);
    }

    public void zapamtiDivljac(Divljac divljac) throws Exception {
        AbstractSO operation = new ZapamtiDivljacSO();
        operation.execute(divljac);
    }

    //ucitavanje objekta
    public List<Lovac> ucitajLovca(Lovac lovac) throws Exception {
        List<Object> param = new ArrayList<>();
        param.add(lovac);
        List<Lovac> result = new ArrayList<>();
        param.add(result);
        AbstractSO operation = new UcitajLovcaSO();
        operation.execute(param);
        return result;
    }

    public List<Divljac> ucitajDivljac(Divljac divljac) throws Exception {
        List<Object> param = new ArrayList<>();
        param.add(divljac);
        List<Divljac> result = new ArrayList<>();
        param.add(result);
        AbstractSO operation = new UcitajDivljacSO();
        operation.execute(param);
        return result;
    }

    public List<Tim> ucitajTim(Tim tim) throws Exception {
        List<Object> param = new ArrayList<>();
        param.add(tim);
        List<Tim> result = new ArrayList<>();
        param.add(result);
        AbstractSO operation = new UcitajTimSO();
        operation.execute(param);
        return result;
    }

    public List<Termin> ucitajTermin(Termin termin) throws Exception {
        List<Object> param = new ArrayList<>();
        param.add(termin);
        List<Termin> result = new ArrayList<>();
        param.add(result);
        return result;
    }

    //ucitavanje liste objekata
    public List<Divljac> ucitajListuDivljaci() throws Exception {
        List<Divljac> list = new ArrayList<>();
        AbstractSO operation = new UcitajListuDivljaciSO();
        operation.execute(list);
        return list;
    }

    public List<Lovac> ucitajListuLovaca() throws Exception {
        List<Lovac> list = new ArrayList<>();
        AbstractSO operation = new UcitajListuLovacaSO();
        operation.execute(list);
        return list;
    }

    public List<Termin> ucitajListuTermina() throws Exception {
        List<Termin> list = new ArrayList<>();
        AbstractSO operation = new UcitajListuTerminaSO();
        operation.execute(list);
        return list;
    }

    public List<Tim> ucitajListuTimova() throws Exception {
        List<Tim> list = new ArrayList<>();
        AbstractSO operation = new UcitajListuTimovaSO();
        operation.execute(list);
        return list;
    }

    public List<Zakazivanje> ucitajListuZakazivanja() throws Exception {
        List<Zakazivanje> list = new ArrayList<>();
        AbstractSO operation = new UcitajListuZakazivanjaSO();
        operation.execute(list);
        return list;
    }

    public void izmeniLovca(Lovac lovac) throws Exception {
        AbstractSO operation = new IzmeniLovcaSO();
        operation.execute(lovac);
    }

    public void izmeniTim(Tim tim) throws Exception {
        AbstractSO operation = new IzmeniTimSO();
        operation.execute(tim);
    }
    
    public void otkaziZakazivanje(Zakazivanje termin) throws Exception {
        AbstractSO operation = new OtkaziSO();
        operation.execute(termin);
    }

    public void zapamtiZakazivanje(Zakazivanje zakazivanje) throws Exception {
        AbstractSO operation = new ZakaziSO();
        operation.execute(zakazivanje);
    }

    public List<ClanskaKarta> ucitajClanskuKartu(ClanskaKarta clanskaKarta) throws Exception {
        List<Object> param = new ArrayList<>();
        param.add(clanskaKarta);
        List<ClanskaKarta> result = new ArrayList<>();
        param.add(result);
        AbstractSO operation = new UcitajClanskuKartuSO();
        operation.execute(param);
        return result;
    }


}

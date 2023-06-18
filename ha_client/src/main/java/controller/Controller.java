/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import communication.Communication;
import communication.Operations;
import communication.Request;
import communication.Response;
import communication.ResponseType;
import domain.ClanskaKarta;
import domain.Divljac;
import domain.Lovac;
import domain.Termin;
import domain.Tim;
import domain.Zakazivanje;
import domain.Zaposleni;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class Controller {

    private static Controller instance;
    private Zaposleni ulogovaniZaposleni;

    private Controller() {
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Zaposleni getUlogovaniZaposleni() {
        return ulogovaniZaposleni;
    }

    public void setUlogovaniZaposleni(Zaposleni ulogovaniZaposleni) {
        this.ulogovaniZaposleni = ulogovaniZaposleni;
    }

    //AUTENTIFIKACIJA
    public Zaposleni login(Zaposleni z) throws Exception {
        Request request = new Request(Operations.LOGIN_CLIENT, z);
        Response response = Communication.getInstance().login(request);

        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            Zaposleni zaposleni = (Zaposleni) response.getResponse();
            ulogovaniZaposleni = zaposleni;
            System.out.println(zaposleni);
            return zaposleni;
        } else {
            throw response.getException();
        }
    }

    public void logout(Zaposleni ulogovani) {
        throw new UnsupportedOperationException("LOGOUT NOT supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //OPERACIJE UNOSA
    public void zapamtiLovca(Lovac lovac) throws Exception {
//        zapamtiClanskuKartu(lovac.getClanskaKarta());
//        Request req = new Request(Operations.NADJI_CLANSKU_KARTU, lovac.getClanskaKarta());
//        Response res = Communication.getInstance().nadji(req);
//        if (!res.getResponseType().equals(ResponseType.SUCCESS)) {
//            throw res.getException();
//        }
//        List<ClanskaKarta> vracena = (List<ClanskaKarta>) res.getResponse();
//        lovac.setClanskaKarta(vracena.get(0));
        Request request = new Request(Operations.ZAPAMTI_LOVCA, lovac);
        Response response = Communication.getInstance().zapamti(request);
        if (!response.getResponseType().equals(ResponseType.SUCCESS)) {
            throw response.getException();
        }
    }

    public void zapamtiTim(Tim tim) throws Exception {
        Request request = new Request(Operations.ZAPAMTI_TIM, tim);
        Response response = Communication.getInstance().zapamti(request);
        if (!response.getResponseType().equals(ResponseType.SUCCESS)) {
            throw response.getException();
        }
    }

    public void zapamtiClanskuKartu(ClanskaKarta clanskaKarta) throws Exception {
        Request request = new Request(Operations.ZAPAMTI_CLANSKU_KARTU, clanskaKarta);
        Response response = Communication.getInstance().zapamti(request);
        if (!response.getResponseType().equals(ResponseType.SUCCESS)) {
            throw response.getException();
        }
    }

    public void zapamtiTermin(Termin termin) throws Exception {
        Request request = new Request(Operations.ZAPAMTI_TERMIN, termin);
        Response response = Communication.getInstance().zapamti(request);
        if (!response.getResponseType().equals(ResponseType.SUCCESS)) {
            throw response.getException();
        }
    }

    public void zapamtiZakazivanje(List<Zakazivanje> zakazivanje) throws Exception {
        Request request = new Request(Operations.ZAPAMTI_ZAKAZIVANJE, zakazivanje);
        Response response = Communication.getInstance().zapamti(request);
        if (!response.getResponseType().equals(ResponseType.SUCCESS)) {
            throw response.getException();
        }
    }

    public void zapamtiDivljac(Divljac divljac) throws Exception {
        Request request = new Request(Operations.ZAPAMTI_DIVLJAC, divljac);
        Response response = Communication.getInstance().zapamti(request);
        if (!response.getResponseType().equals(ResponseType.SUCCESS)) {
            throw response.getException();
        }
    }

    //OPERACIJE PRETRAGE
    public List<Lovac> nadjiLovca(Lovac lovac) throws Exception {
        Request request = new Request(Operations.NADJI_LOVCA, lovac);
        Response response = Communication.getInstance().nadji(request);
        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            List<Lovac> trazeni = (List<Lovac>) response.getResponse();
            return trazeni;
        } else {
            throw response.getException();
        }
    }

    public List<Tim> nadjiTim(Tim tim) throws Exception {
        Request request = new Request(Operations.NADJI_TIM, tim);
        Response response = Communication.getInstance().nadji(request);
        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            List<Tim> trazeni = (List<Tim>) response.getResponse();
            return trazeni;
        } else {
            throw response.getException();
        }
    }

    public List<Divljac> nadjiDivljac(Divljac divljac) throws Exception {
        Request request = new Request(Operations.NADJI_DIVLJAC, divljac);
        Response response = Communication.getInstance().nadji(request);
        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            List<Divljac> trazeni = (List<Divljac>) response.getResponse();
            return trazeni;
        } else {
            throw response.getException();
        }
    }

    //OPERACIJE IZMENE
    public void izmeniLovca(Lovac lovac) throws Exception {
//        ClanskaKarta nova = new ClanskaKarta();
//        nova.setClanarina(lovac.getClanskaKarta().getClanarina());
//        nova.setDatumUplate(lovac.getClanskaKarta().getDatumUplate());
//        nova.setDatumIsteka(lovac.getClanskaKarta().getDatumIsteka());
//        zapamtiClanskuKartu(nova);
//        
//        Request req = new Request(Operations.NADJI_CLANSKU_KARTU, nova);
//        Response res = Communication.getInstance().nadji(req);
//        if (!res.getResponseType().equals(ResponseType.SUCCESS)) {
//            throw res.getException();
//        }
//        List<ClanskaKarta> vracena = (List<ClanskaKarta>) res.getResponse();
//        lovac.setClanskaKarta(vracena.get(0));
        Request request = new Request(Operations.IZMENI_LOVCA, lovac);
        Response response = Communication.getInstance().izmeni(request);
        if (!response.getResponseType().equals(ResponseType.SUCCESS)) {
            throw response.getException();
        }
    }

    public void izmeniTim(Tim tim) throws Exception {
        Request request = new Request(Operations.IZMENI_TIM, tim);
        Response response = Communication.getInstance().izmeni(request);
        if (!response.getResponseType().equals(ResponseType.SUCCESS)) {
            throw response.getException();
        }
    }

    //OPERACIJE UCITAVANJA LISTI
    public List<Lovac> ucitajListuLovaca() throws Exception {
        Request request = new Request(Operations.UCITAJ_LISTU_LOVACA, null);
        Response response = Communication.getInstance().ucitajListu(request);
        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            List<Lovac> lista = (List<Lovac>) response.getResponse();
            return lista;
        } else {
            throw response.getException();
        }
    }

    public List<Tim> ucitajListuTimova() throws Exception {
        Request request = new Request(Operations.UCITAJ_LISTU_TIMOVA, null);
        Response response = Communication.getInstance().ucitajListu(request);
        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            List<Tim> lista = (List<Tim>) response.getResponse();
            return lista;
        } else {
            throw response.getException();
        }
    }

    public List<Termin> ucitajListuTermina() throws Exception {
        Request request = new Request(Operations.UCITAJ_LISTU_TERMINA, null);
        Response response = Communication.getInstance().ucitajListu(request);
        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            List<Termin> lista = (List<Termin>) response.getResponse();
            return lista;
        } else {
            throw response.getException();
        }
    }

    public List<Divljac> ucitajListuDivljaci() throws Exception {
        Request request = new Request(Operations.UCITAJ_LISTU_DIVLJACI, null);
        Response response = Communication.getInstance().ucitajListu(request);
        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            List<Divljac> lista = (List<Divljac>) response.getResponse();
            return lista;
        } else {
            throw response.getException();
        }
    }

    public List<Zakazivanje> ucitajListuZakazivanja() throws Exception {
        Request request = new Request(Operations.UCITAJ_LISTU_ZAKAZIVANJA, null);
        Response response = Communication.getInstance().ucitajListu(request);
        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            List<Zakazivanje> lista = (List<Zakazivanje>) response.getResponse();
            return lista;
        } else {
            throw response.getException();
        }
    }

    public void otkazi(List<Zakazivanje> zakazivanje) throws Exception {
        Request request = new Request(Operations.OTKAZI_TERMIN, zakazivanje);
        Response response = Communication.getInstance().izmeni(request);
        if (!response.getResponseType().equals(ResponseType.SUCCESS)) {
            throw response.getException();
        }    
    }

}

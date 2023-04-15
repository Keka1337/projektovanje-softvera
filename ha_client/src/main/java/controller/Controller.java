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
import domain.Lovac;
import domain.Termin;
import domain.Tim;
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

    public List<Lovac> nadjiTim(Tim tim) throws Exception {
        Request request = new Request(Operations.NADJI_TIM, tim);
        Response response = Communication.getInstance().nadji(request);
        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            List<Lovac> trazeni = (List<Lovac>) response.getResponse();
            return trazeni;
        } else {
            throw response.getException();
        }
    }

    //OPERACIJE IZMENE
    public void izmeniLovca(Lovac lovac) throws Exception {
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

}

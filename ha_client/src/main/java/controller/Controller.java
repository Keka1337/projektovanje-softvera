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
import domain.Zaposleni;

/**
 *
 * @author Jelena
 */
public class Controller {

    private static Controller instance;
    private Zaposleni ulogovaniAdministrator;

    private Controller() {
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Zaposleni login(Zaposleni a) throws Exception {

        Request request = new Request(Operations.LOGIN_ADMIN, a);
        Response response = Communication.getInstance().login(request);

        if (response.getResponseType().equals(ResponseType.SUCCESS)) {
            Zaposleni admin = (Zaposleni) response.getResponse();
            ulogovaniAdministrator = admin;
            System.out.println(admin);
            return admin;
        } else {
            throw response.getException();
        }
    }

    public Zaposleni getUlogovaniAdministrator() {
        return ulogovaniAdministrator;
    }

    public void setUlogovaniAdministrator(Zaposleni ulogovaniAdministrator) {
        this.ulogovaniAdministrator = ulogovaniAdministrator;
    }

}

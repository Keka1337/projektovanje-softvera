/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communication;

import domain.Lovac;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jelena
 */
public class Communication {

    private static Communication instance;
    private Socket socket;
    private static final Logger LOG = Logger.getLogger(Communication.class.getName());

    private Communication() {

    }

    public static Communication getInstance() {
        if (instance == null) {
            instance = new Communication();
        }
        return instance;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Response login(Request request) throws Exception {
        new Sender(socket).send(request);
        System.out.println("Communication Class: Request to login has been sent.");
        return (Response) new Receiver(socket).receive();
    }

    //OPERACIJA UNOSA
    public Response zapamti(Request request) throws Exception {
        new Sender(socket).send(request);
        LOG.log(Level.INFO, "Zahtev za dodavanje je poslat. Objekat: {0}", request.getArgument().toString());
        return (Response) new Receiver(socket).receive();
    }

    //OPERACIJA PRETRAGE
    public Response nadji(Request request) throws Exception {
        new Sender(socket).send(request);
        LOG.log(Level.INFO, "Zahtev za pronalazenje je poslat");
        return (Response) new Receiver(socket).receive();
    }

    //OPERACIJA IZMENE
    public Response izmeni(Request request) throws Exception {
        new Sender(socket).send(request);
        LOG.log(Level.INFO, "Zahtev za izmenu objekta {0} je poslat", request.getArgument().toString());
        return (Response) new Receiver(socket).receive();
    }
    
        //OPERACIJA UCITAVANJA LISTE
    public Response ucitajListu(Request request) throws Exception {
        new Sender(socket).send(request);
        LOG.log(Level.INFO, "Zahtev za ucitavanje liste je poslat");
        return (Response) new Receiver(socket).receive();
    }

}

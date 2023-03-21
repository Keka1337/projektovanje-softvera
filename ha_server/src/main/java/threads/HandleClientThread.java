/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import communication.Operations;
import communication.Receiver;
import communication.Request;
import communication.Response;
import communication.Sender;
import domain.Zaposleni;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jelena
 */
public class HandleClientThread extends Thread {

    private Socket socket;
    Zaposleni zaposleni;
    ServerThread serverThread;

    public HandleClientThread(Socket socket, ServerThread serverThread) {
        this.socket = socket;
        this.serverThread = serverThread;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    @Override
    public void run() {

        try {
            while (!socket.isClosed()) {

                //primamo zahtev
                Request request = (Request) new Receiver(socket).receive();
                //pravimo odgovor
                Response response = handleRequest(request);
                if (response == null) {
                    continue;

                }
                //saljemo odgovor klijentu 
                new Sender(socket).send(response);
            }
        } catch (Exception ex) {
            // this.interrupt();
            Logger.getLogger(HandleClientThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Socket getSocket() {
        return socket;
    }

    private Response handleRequest(Request request) {
        int operation = request.getOperation();
        switch (operation) {
            case Operations.LOGIN_ADMIN:
                break;

        }
        return null;
    }

}

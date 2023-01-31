/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import communication.Communication;
import java.io.IOException;
import java.net.Socket;
import view.FrmLogin;

/**
 *
 * @author Jelena
 */
public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.connect();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void connect() throws IOException {
        Socket socket = new Socket("127.0.0.1", 9000);
        System.out.println("Klijent se povezao sa serverom");
        Communication.getInstance().setSocket(socket);
        new FrmLogin().setVisible(true);
    }

}

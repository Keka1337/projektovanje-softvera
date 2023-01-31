/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communication;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

/**
 *
 * @author Jelena
 */
public class Sender implements Serializable {

    private Socket socket;

    public Sender(Socket socket) {
        this.socket = socket;
    }

    public void send(Object object) throws Exception {
        ObjectOutputStream out;
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(object);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error while sending object: " + ex.getMessage());
        }
    }

}

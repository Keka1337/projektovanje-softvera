/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.FrmMainServer;

/**
 *
 * @author Jelena
 */
public class ClientThread extends Thread {

    FrmMainServer frmServer;

    public ClientThread(FrmMainServer frmServer) {
        this.frmServer = frmServer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                frmServer.prepareView();
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, "Greška u klijentskoj niti!", ex);
            }
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import constants.ServerConstants;
import domain.Zaposleni;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import view.FrmMainServer;

/**
 *
 * @author Jelena
 */
public class ServerThread extends Thread {

    private final ServerSocket serverSocket;
    private List<HandleClientThread> clients;
    private FrmMainServer forma;

    public ServerThread(FrmMainServer frmMainServer) throws IOException {
//        Properties properties = new Properties();
//        properties.load(new FileInputStream(ServerConstants.SERVER_CONFIG_FILE));
//        int port = (int) properties.get(ServerConstants.PORT);
        serverSocket = new ServerSocket(9000);
        forma = frmMainServer;
        clients = new ArrayList<>();
    }
    
    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public List<HandleClientThread> getClients() {
        return clients;
    }

    @Override
    public void run() {

        while (!serverSocket.isClosed()) {

            try {
                System.out.println("Waiting for a client...");
                Socket socket = serverSocket.accept();
                HandleClientThread thread = new HandleClientThread(socket, this);
                thread.start();
                clients.add(thread);
                System.out.println("Client is connected!");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void removeClientThread(HandleClientThread klijentNit) {
        clients.remove(klijentNit);
    }

    public void stopAllThreads() {
        for (HandleClientThread client : clients) {
            try {
                client.getSocket().close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public List<Zaposleni> vratiPrijavljeneZaposlene() {
        List<Zaposleni> zaposleni = new ArrayList<>();
        for (HandleClientThread client : clients) {
            zaposleni.add(client.getZaposleni());
        }
        return zaposleni;
    }

    public List<HandleClientThread> getAllClientThreads() {
        List<HandleClientThread> list = new ArrayList<>();
        for (HandleClientThread client : clients) {
            list.add(client);
        }
        return list;
    }

}

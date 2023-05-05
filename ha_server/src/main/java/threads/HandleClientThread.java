/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import communication.Operations;
import communication.Receiver;
import communication.Request;
import communication.Response;
import communication.ResponseType;
import communication.Sender;
import controller.Controller;
import domain.ClanskaKarta;
import domain.Divljac;
import domain.Lovac;
import domain.Termin;
import domain.Tim;
import domain.Zakazivanje;
import domain.Zaposleni;
import java.net.Socket;
import java.util.List;
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
    Logger LOG = Logger.getLogger(HandleClientThread.class.getName());

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
                Request request = (Request) new Receiver(socket).receive();
                Response response = handleRequest(request);
                if (response == null) {
                    continue;
                }
                //saljemo odgovor klijentu 
                new Sender(socket).send(response);
            }
        } catch (Exception ex) {
            Logger.getLogger(HandleClientThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Socket getSocket() {
        return socket;
    }

    private Response handleRequest(Request request) {
        int operation = request.getOperation();
        switch (operation) {
            case Operations.LOGIN_CLIENT:
                return login(request);
            case Operations.LOGOUT_CLIENT:
                logout(request);
                break;
            case Operations.ZAPAMTI_LOVCA:
                return zapamtiLovca(request);
            case Operations.ZAPAMTI_TIM:
                return zapamtiTim(request);
            case Operations.ZAPAMTI_ZAKAZIVANJE:
                return zapamtiZakazivanje(request);
            case Operations.ZAPAMTI_CLANSKU_KARTU:
                return zapamtiClanskuKartu(request);
            case Operations.ZAPAMTI_TERMIN:
                return zapamtiTermin(request);
            case Operations.ZAPAMTI_DIVLJAC:
                return zapamtiDivljac(request);
            case Operations.UCITAJ_LISTU_LOVACA:
                return ucitajListuLovaca(request);
            case Operations.UCITAJ_LISTU_TIMOVA:
                return ucitajListuTimova(request);
            case Operations.UCITAJ_LISTU_TERMINA:
                return ucitajListuTermina(request);
            case Operations.UCITAJ_LISTU_DIVLJACI:
                return ucitajListuDivljaci(request);
            case Operations.UCITAJ_LISTU_ZAKAZIVANJA:
                return ucitajListuZakazivanja(request);                
            case Operations.IZMENI_LOVCA:
                return izmeniLovca(request);
            case Operations.IZMENI_TIM:
                return izmeniTim(request);
            case Operations.NADJI_DIVLJAC:
                return ucitajDivljac(request);
            case Operations.NADJI_LOVCA:
                return ucitajLovca(request);
            case Operations.NADJI_CLANSKU_KARTU:
                return ucitajClanskuKartu(request);
            case Operations.NADJI_TIM:
                return ucitajTim(request);
            case Operations.OTKAZI_TERMIN:
                return otkaziTermin(request);
        }
        return null;
    }

    //AUTENTIFIKACIJA
    private Response login(Request request) {
        Response response = new Response();
        Zaposleni requestZap = (Zaposleni) request.getArgument();
        try {
            Zaposleni vraceni = Controller.getInstance().pronadjiZaposlenog(requestZap);
            System.out.println("Zaposleni je prijavljen na sistem.");
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(vraceni);
            this.zaposleni = vraceni;
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private void logout(Request request) {
        Zaposleni adminLogout = (Zaposleni) request.getArgument();
        try {
            serverThread.removeClientThread(this);
            socket.close();
            LOG.info("Zaposleni je odjavljen iz sistema");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //OPERACIJE UNOSA
    private Response zapamtiLovca(Request request) {
        Response response = new Response();
        Lovac lovac = (Lovac) request.getArgument();
        try {
            Controller.getInstance().zapamtiLovca(lovac);
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(null);
            LOG.info("Lovac je uspesno sacuvan.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response zapamtiTim(Request request) {
        Response response = new Response();
        Tim tim = (Tim) request.getArgument();
        try {
            Controller.getInstance().zapamtiTim(tim);
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(null);
            LOG.info("Tim je uspesno sacuvan.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response zapamtiClanskuKartu(Request request) {
        Response response = new Response();
        ClanskaKarta clanskaKarta = (ClanskaKarta) request.getArgument();
        try {
            Controller.getInstance().zapamtiClanskuKartu(clanskaKarta);
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(null);
            LOG.info("Clanska karta je uspesno sacuvana.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response zapamtiZakazivanje(Request request) {
        Response response = new Response();
        Zakazivanje zakazivanje = (Zakazivanje) request.getArgument();
        try {
            Controller.getInstance().zapamtiZakazivanje(zakazivanje);
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(null);
            LOG.info("Zakazivanje je uspesno izvrseno.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response zapamtiTermin(Request request) {
        Response response = new Response();
        Termin termin = (Termin) request.getArgument();
        try {
            Controller.getInstance().zapamtiTermin(termin);
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(null);
            LOG.info("Termin je uspesno sacuvan.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }
    
    private Response zapamtiDivljac(Request request) {
        Response response = new Response();
        Divljac divljac = (Divljac) request.getArgument();
        try {
            Controller.getInstance().zapamtiDivljac(divljac);
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(null);
            LOG.info("Divljac je uspesno sacuvana.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }
    
    
    //OPERACIJE UCITAVANJA LISTI
    private Response ucitajListuLovaca(Request request) {
        Response response = new Response();
        try {
            List<Lovac> lista = Controller.getInstance().ucitajListuLovaca();
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(lista);
            LOG.info("Uspesno ucitavanje liste lovaca.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response ucitajListuTimova(Request request) {
        Response response = new Response();
        try {
            List<Tim> lista = Controller.getInstance().ucitajListuTimova();
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(lista);
            LOG.info("Uspesno ucitavanje liste timova.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response ucitajListuTermina(Request request) {
        Response response = new Response();
        try {
            List<Termin> lista = Controller.getInstance().ucitajListuTermina();
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(lista);
            LOG.info("Uspesno ucitavanje liste termina.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response ucitajListuDivljaci(Request request) {
        Response response = new Response();
        try {
            List<Divljac> lista = Controller.getInstance().ucitajListuDivljaci();
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(lista);
            LOG.info("Uspesno ucitavanje liste divljaci.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }
    
    private Response ucitajListuZakazivanja(Request request) {
        Response response = new Response();
        try {
            List<Zakazivanje> lista = Controller.getInstance().ucitajListuZakazivanja();
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(lista);
            LOG.info("Uspesno ucitavanje liste zakazivanja.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;    }

    //OPERACIJE IZMENE
    private Response izmeniLovca(Request request) {
        Response response = new Response();
        Lovac lovac = (Lovac) request.getArgument();
        try {
            Controller.getInstance().izmeniLovca(lovac);
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(null);
            LOG.info("Uspesno azuriranje podataka o lovcu.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response izmeniTim(Request request) {
        Response response = new Response();
        Tim tim = (Tim) request.getArgument();
        try {
            Controller.getInstance().izmeniTim(tim);
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(null);
            LOG.info("Uspesno azuriranje podataka o timu.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response otkaziTermin(Request request) {
        Response response = new Response();
        Zakazivanje termin = (Zakazivanje) request.getArgument();
        try {
            Controller.getInstance().otkaziZakazivanje(termin);
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(null);
            LOG.info("Uspesno otkazaivanje termina.");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;    }
    
    //OPERACIJE PRETRAGE
    private Response ucitajDivljac(Request request) {
        Response response = new Response();
        try {
            List<Divljac> trazeni = Controller.getInstance().ucitajDivljac((Divljac) request.getArgument());
            System.out.println("Sistem je nasao divljac po zadatoj vrednosti.");
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(trazeni);
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response ucitajLovca(Request request) {
        Response response = new Response();
        try {
            List<Lovac> trazeni = Controller.getInstance().ucitajLovca((Lovac) request.getArgument());
            System.out.println("Sistem je nasao lovca po zadatoj vrednosti.");
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(trazeni);
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;
    }

    private Response ucitajClanskuKartu(Request request) {
        Response response = new Response();
        try {
            List<ClanskaKarta> trazeni = Controller.getInstance().ucitajClanskuKartu((ClanskaKarta) request.getArgument());
            System.out.println("Sistem je nasao clansku kartu po zadatoj vrednosti.");
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(trazeni);
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;    }

    private Response ucitajTim(Request request) {
        Response response = new Response();
        try {
            List<Tim> trazeni = Controller.getInstance().ucitajTim((Tim) request.getArgument());
            System.out.println("Sistem je nasao tim po zadatoj vrednosti.");
            response.setResponseType(ResponseType.SUCCESS);
            response.setResponse(trazeni);
        } catch (Exception ex) {
            ex.printStackTrace();
            response.setResponseType(ResponseType.ERROR);
            response.setException(ex);
        }
        return response;    
    }
    
}

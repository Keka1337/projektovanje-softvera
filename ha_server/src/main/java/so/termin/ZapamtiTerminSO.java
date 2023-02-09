/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.termin;

import domain.Termin;
import exception.ValidationException;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class ZapamtiTerminSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
        if (param == null || !(param instanceof Termin)) {
            throw new ValidationException("Prosledjeni parametar mora biti objekat klase lovac!");
        }

        String message = "";
        Termin termin = (Termin) param;
        if (termin.getDatum() == null || termin.getDatum().toString().equals(" ")) {
            message += "Termin mora imati unet datum!\n";
        }

        if (!message.equals("")) {
            throw new ValidationException(message);
        }

    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        repository.add((Termin) param);
    }

}

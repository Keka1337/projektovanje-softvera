/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.tim;

import domain.Tim;
import exception.ValidationException;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class ZapamtiTimSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws ValidationException {
        if (param == null || !(param instanceof Tim)) {
            throw new ValidationException("Prosledjeni parametar mora biti objekat klase lovac!");
        }

        String message = "";

        Tim tim = (Tim) param;
        if (tim.getNaziv().isEmpty()) {
            message += "Tim morati imati unet naziv!\n";
        }

        if (!message.equals("")) {
            throw new ValidationException(message);
        }
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        repository.add((Tim) param);
    }

}

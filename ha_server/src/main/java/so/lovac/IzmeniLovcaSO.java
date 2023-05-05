/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.lovac;

import domain.Lovac;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class IzmeniLovcaSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws Exception {
        if (param == null || !(param instanceof Lovac)) {
            throw new Exception("Neodgovarajuci parametar!");
        }

        String message = "";
        Lovac fudbaler = (Lovac) param;
        if (fudbaler.getIme().isEmpty()) {
            message += "Polje za ime ne sme biti prazno!\n";
        }
        if (fudbaler.getPrezime().isEmpty()) {
            message += "Polje za prezime ne sme biti prazno!\n";
        }
       
        if (!message.equals("")) {
            throw new Exception(message);
        }
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        repository.edit((Lovac) param);
    }
    
}

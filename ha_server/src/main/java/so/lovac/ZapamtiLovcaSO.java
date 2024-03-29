/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.lovac;

import domain.ClanskaKarta;
import domain.Lovac;
import exception.ValidationException;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author Jelena
 */
public class ZapamtiLovcaSO extends AbstractSO {

    @Override
    protected void precondition(Object param) throws ValidationException {
        if (param == null || !(param instanceof Lovac)) {
            throw new ValidationException("Prosledjeni parametar mora biti objekat klase lovac!");
        }

        String message = "";
        Lovac lovac = (Lovac) param;
        if (lovac.getIme().isEmpty()) {
            message += "Lovac mora imati uneto ime!\n";
        }
        if (lovac.getPrezime().isEmpty()) {
            message += "Lovac mora imati uneto prezime!\n";
        }
        if (lovac.getJMBG().isEmpty()) {
            message += "Lovac mora imati unet JMBG!\n";
        }

        if (!message.equals("")) {
            throw new ValidationException(message);
        }

    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        Lovac lovac = (Lovac) param;
        ClanskaKarta ck = lovac.getClanskaKarta();
        repository.add(ck);
        
        List<ClanskaKarta> vracene = repository.getAll(ck);
        lovac.setClanskaKarta(vracene.get(vracene.size()-1));
        
        repository.add((Lovac) param);
    }

}

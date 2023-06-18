/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Jelena
 */
public class Validator {

    private final List<String> validationErros;

    private Validator() {
        validationErros = new ArrayList<>();
    }

    public static Validator startValidation() {
        return new Validator();
    }

    public Validator validateNotNullOrEmpty(String value, String errorMessage) throws ValidationException {
        if (value == null || value.trim().isEmpty()) {
            this.validationErros.add(errorMessage);
        }
        return this;
    }

    public Validator validateNotNull(Object value, String errorMessage) throws ValidationException {
        if (value == null) {
            this.validationErros.add(errorMessage);
        }
        return this;
    }

    public Validator validateValueIsNumber(String value, String errorMessage) throws ValidationException {
        try {
            if (value != null) {
                new BigDecimal(value);
            } else {
                this.validationErros.add(errorMessage);
            }
        } catch (NumberFormatException nfe) {
            this.validationErros.add(errorMessage);
        }
        return this;
    }

    public Validator validateValueIsDate(String value, String pattern, String errorMessage) throws ValidationException {
        try {
            if (value != null) {
                SimpleDateFormat sdf = new SimpleDateFormat(pattern);
                sdf.parse(value);
            } else {
                this.validationErros.add(errorMessage);
            }
        } catch (ParseException ex) {
            this.validationErros.add(errorMessage);
        }
        return this;
    }

    public Validator validateListIsNotEmpty(List list, String errorMessage) throws ValidationException {
        if (list == null || list.isEmpty()) {
            this.validationErros.add(errorMessage);
        }
        return this;
    }
    
    public Validator validateJMBG(String value, String errorMessage) {
        if (value.isEmpty() || value.trim().length() != 13 ) {
            this.validationErros.add(errorMessage);
        }
        return this;
    }

    public Validator validateNumberIsNotNegative(Double value, String errorMessage) {
        if (value < 0) {
            this.validationErros.add(errorMessage);
        }
        return this;
    }

    public void throwIfInvalide() throws ValidationException {
        if (!validationErros.isEmpty()) {
            throw new ValidationException(this.validationErros.stream().collect(Collectors.joining("\n")));
        }
    }
    
    
    
}

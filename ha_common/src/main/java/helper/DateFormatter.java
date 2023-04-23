/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jelena
 */
public class DateFormatter {

    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    private static final SimpleDateFormat dbFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public static String formatirajDatum(Date date) {
        return formatter.format(date);
    }

    public static Date odrediDatumIsteka(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.YEAR, 1);
        return c.getTime();
    }

    public static Date formatDb(String date) {
        try {
            return dbFormatter.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(DateFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

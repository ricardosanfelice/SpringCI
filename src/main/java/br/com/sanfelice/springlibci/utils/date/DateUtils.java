package br.com.sanfelice.springlibci.utils.date;

import java.time.LocalDate;

public class DateUtils {
    
    private DateUtils() {
        
    }

    public static LocalDate toLocalDate(String strDate) {
        return LocalDate.parse(strDate);
    }
}

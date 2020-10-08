package br.com.sanfelice.javautils.utils.date;

import java.time.LocalDate;

public class DateUtils {

    private DateUtils() {

    }

    public static LocalDate toLocalDate(String strDate) {
        if (strDate == null || strDate.isBlank()) {
            return null;
        }

        return LocalDate.parse(strDate);
    }
}

package br.com.sanfelice.javautils.utils.date;

import java.time.LocalDate;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DateUtilsTest {

    @Test
    @DisplayName("Must return null on null parameter")
    public void mustReturnNullOnNull() {
        LocalDate actual = DateUtils.toLocalDate(null);

        assertThat(actual, nullValue());
    }

    @Test
    @DisplayName("Must return null on empty parameter")
    public void mustReturnNullOnEmpty() {
        LocalDate actual = DateUtils.toLocalDate("");

        assertThat(actual, nullValue());
    }

    @Test
    @DisplayName("Must return null on blank parameter")
    public void mustReturnNullOnBlank() {
        LocalDate actual = DateUtils.toLocalDate("   ");

        assertThat(actual, nullValue());
    }

    @Test
    public void mustConvertStringToLocalDate() {
        String date = "2020-10-07";
        LocalDate expected = LocalDate.parse(date);
        LocalDate actual = DateUtils.toLocalDate(date);

        assertThat(actual, is(expected));
    }
}

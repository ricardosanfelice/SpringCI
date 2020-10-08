package br.com.sanfelice.javautils.utils.date;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

public class DateUtilsTest {

    @Test
    public void mustConvertStringToLocalDate() {
        String date = "2020-10-07";
        LocalDate expected = LocalDate.parse(date);
        LocalDate actual = DateUtils.toLocalDate(date);

        assertThat(actual, is(expected));
    }
}

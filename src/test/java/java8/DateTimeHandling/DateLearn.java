package java8.DateTimeHandling;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateLearn {
    @Test
    public void loocalDate() {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.plusDays(3));
        ZonedDateTime.of(localDate.atTime(22, 30), ZoneId.of("Asia/Kolkata"));
    }

}

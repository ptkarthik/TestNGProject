package java8.DateTimeHandling;

import org.testng.annotations.Test;

import java.time.*;
import java.time.temporal.Temporal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateLearn {
    @Test
    public void loocalDate() {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalTime
//        Tempoal
ZoneId.of("Asia");

        System.out.println(localDate.plusDays(3));
        System.out.println(ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Kolkata")));
        ZonedDateTime.of(localDate.atTime(22, 30), ZoneId.of("Asia/Kolkata"));
    }

}

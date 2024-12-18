package java8.DateTimeHandling;

import org.testng.annotations.Test;

import java.time.*;
import java.time.temporal.Temporal;

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
    }

}

package practise.collectionsproogrampractise.java8.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTimeAPiCheck {
    /*
     Write a predicate to check if the given date is yesterday date.
2. Write a Supplier to get Date for next Thursday.
3. Write a Supplier to get CurrentTime in EST timezone
4. Write a Function to calculate the age of a person given date of birth.
     */


    public static void main(String[] args) {
        //1
        LocalDate givenDate = LocalDate.of(2025, 01, 21);
        checkTodayDateIsYesterdayData(givenDate);
        LocalDate dob = LocalDate.of(1989, 03, 10);
        currentTimeInEst();
        ageofaPerson(dob);
    }

    private static void ageofaPerson(LocalDate dob) {
        System.out.println(Period.between(dob, LocalDate.now()).getYears());
    }

    private static void currentTimeInEst() {
        Supplier<ZonedDateTime> s = () -> ZonedDateTime.
                now(ZoneId.of("America/New_York"));
        System.out.println(s.get());
    }


    private static void checkTodayDateIsYesterdayData(LocalDate givenDate) {
        Predicate<LocalDate> localDatePredicate = date -> date.
                equals(LocalDate.now().minusDays(1));
        System.out.println(localDatePredicate.test(givenDate));
    }
}

package com.home.efj.cad.unnecessary;

import lombok.extern.log4j.Log4j;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Log4j
public class BoomerTest {

    public static void run() {
        Date dateForNonOptimal = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        Date dateForOptimal = new GregorianCalendar(2010, Calendar.FEBRUARY, 11).getTime();

        PersonNonOptimal personNonOptimal = new PersonNonOptimal(dateForNonOptimal);
        PersonOptimal personOptimal = new PersonOptimal(dateForOptimal);

        log.info("Non optimal person: " + test(personNonOptimal, 10_000_000) + " ms");
        log.info("Optimal person: " + test(personOptimal, 10_000_000) + " ms");
    }

    private static long test(Person person, int count) {
        long start = System.currentTimeMillis();

        for(int i = 0; i < count; i++) {
            person.isBabyBoomer();
        }

        return System.currentTimeMillis() - start;
    }
}

package com.home.efj.cad.unnecessary;

import lombok.AllArgsConstructor;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@AllArgsConstructor
public class PersonNonOptimal implements Person {

    private final Date birthDate;

    @Override
    public boolean isBabyBoomer() {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomerStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomerEnd = gmtCal.getTime();

        return birthDate.compareTo(boomerStart) >= 0 && birthDate.compareTo(boomerEnd) < 0;
    }
}

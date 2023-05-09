package com.simformsolutions.LocalDateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Zone {
  public static void main(String[] args) {

    /**
     * print localdate
     */
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);
    System.out.println(localDate.getClass().getSimpleName());

    /**
     * convert date into string
     */
    String stringDate = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    System.out.println(stringDate);
    System.out.println(stringDate.getClass().getSimpleName());

    /**
     * coustom local date
     */
    localDate = LocalDate.of(2000,12,18);
    System.out.println(localDate);

    /**
     * String into date
     */
    String stringToDate = "2000-12-18";
    System.out.println(stringToDate.getClass().getSimpleName());
    localDate = LocalDate.parse(stringToDate);
    System.out.println(localDate);
    System.out.println(localDate.getClass().getSimpleName());

    /**
     * Current Time using LocalTime
     */
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);

    /**
     * PlusMinutes
     * PlusHours
     * PlusSeconds
     */
    localTime = localTime.plusHours(1);
    System.out.println(localTime);
    localTime = localTime.plusMinutes(120);
    System.out.println(localTime);

    /**
     * ZoneId of Asia/Kolkata --> 2023-05-09T07:09:53.961019100+05:30[Asia/Kolkata]
     * where +5:30 hours ahead of Coordinated Universal Time(Universal Time )
     */
    ZoneId zoneId = ZoneId.of("Asia/Kolkata");
    System.out.println(zoneId);

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,zoneId);
    System.out.println(zonedDateTime);

    System.out.println(zonedDateTime.getZone());

  }
}

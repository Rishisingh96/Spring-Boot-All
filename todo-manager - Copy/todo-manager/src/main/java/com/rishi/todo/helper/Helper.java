package com.rishi.todo.helper;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.time.*;
import java.util.Date;

public class Helper {
    public static Date parseDate(LocalDateTime localDateTime) throws ParseException{
        System.out.println(localDateTime);
       // Instant instant = localDateTime.toInstant(ZoneOffset.UTC);
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
//        Date date = Date.from(instant);
        return Date.from(instant);

    }
}

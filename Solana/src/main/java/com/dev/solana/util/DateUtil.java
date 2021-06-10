package com.dev.solana.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


@Slf4j
@Component
public class DateUtil {
    private final long DAY = 24 * 60 * 60 * 1000;
    private final String PATTERN = "yyyy.MM.dd";
    private final SimpleDateFormat format = new SimpleDateFormat(PATTERN);


    public long calPeroid(String startDate, String endDate) throws ParseException {
        Date start = format.parse(startDate);
        Date end = format.parse(endDate);

        long calDate = end.getTime() - start.getTime();
        long period = calDate / DAY;

        return period;
    }

    public double calElapsed(long startTime, long endTime) throws ParseException {
        double period = 0;
        period = ( endTime - startTime ) / 1000.0;
        log.debug( "경과 시간 : " + period + "초" );

        return period;
    }

    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd/HH:mm:ss");
        return sdf.format(cal.getTime());
    }


    public String dateToString(Date date) {
        return format.format(date);
    }

    public Date stringToDate(String date) throws ParseException {
        return format.parse(date);
    }

    public String calDate(Date date, int period) {
        Calendar cal  = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE,period);

        return format.format(cal.getTime());
    }

    public String calDate(String date, int period) throws ParseException {
        Date startDate = stringToDate(date);
        return calDate(startDate,period);
    }
}

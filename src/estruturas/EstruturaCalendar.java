package estruturas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class EstruturaCalendar {
    public static void main(String[] args) {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2022-02-21T13:09:09Z"));
        System.out.println(sdf1.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
//        cal.add(Calendar.HOUR_OF_DAY,3);
//        d = cal.getTime();
        int minutes = cal.get(Calendar.MINUTE);
        int hours = cal.get(Calendar.HOUR);
        int second = cal.get(Calendar.SECOND);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println("Month: " + month);
        System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + second);

    }
}

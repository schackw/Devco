package co.com.devco.certificacion.booking.utils;


import java.util.Calendar;

public class GetDate {
    private GetDate(){

    }

    public static String getDateAAAAMMDD(){
        Calendar calendar = Calendar.getInstance();
        String month = String.valueOf(calendar.get(Calendar.MONTH)+1);
        String day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(month);
        return String.valueOf(calendar.get(Calendar.YEAR)).substring(0,4)+"-"+month+"-"+day;
    }
}

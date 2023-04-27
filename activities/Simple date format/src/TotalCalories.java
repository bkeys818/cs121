//******************************************************************
//  Activity 34
//  Name: Ben Keys
//  Data Structures Date: 04/17/2023
//******************************************************************
//  A demonstration of dates.
//******************************************************************

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TotalCalories {
    DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");

    int calcTotal(int cal, String start, String end) {
        int days = 0;
        try {
            Date startDate = dateFormat.parse(start);
            Date endDate = dateFormat.parse(end);
            long difference = endDate.getTime() - startDate.getTime();
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        } catch (ParseException error) {
            error.printStackTrace();
        }
        return days * cal;
    }
}

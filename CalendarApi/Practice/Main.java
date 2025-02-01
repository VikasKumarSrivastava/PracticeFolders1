package CalendarApi.Practice;

import java.util.Calendar;
import java.util.Date;

class Solution{
    public static String quarter(Date currentDate){
        String[] quaters = {"Q1","Q2","Q3","Q4"};
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        int quarter = calendar.get(Calendar.MONTH)/3;
        return quaters[quarter];
    }

}

public class Main {
    public static void main(String[] args) {  
        @SuppressWarnings("deprecation")
        Date date = new Date(120, 11, 18);
        System.out.println(date);
        String q = Solution.quarter(date);
        System.out.println(q);
    }

}

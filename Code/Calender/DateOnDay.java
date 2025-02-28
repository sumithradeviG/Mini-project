package Calender;

import java.util.HashMap;
import java.util.Map;

public class DateOnDay {
    public static void dateOnDay(int mon1, int year1, String day1){
        int date1 = 1;
        int FrstDay = 0;
        Map<String, Integer> week =  new HashMap<>();
        week.put("sun", 0);
        week.put("mon", 1);
        week.put("tue", 2);
        week.put("wed",3);
        week.put("thu",4);
        week.put("fri",5);
        week.put("sat",6);
        DayonDate Day = new DayonDate();
        String refDay = Day.NonLeap(date1,mon1,year1);
        if(week.get(day1)<week.get(refDay)){
            FrstDay = date1 + (7-(week.get(refDay)- week.get(day1)));
        }
        else{
            FrstDay = date1 + (week.get(day1)- week.get(refDay));
        }
        System.out.println(FrstDay);
    }
    public static void dateOnDay(String Today, int AfterDays){
        Map<String, Integer> week =  new HashMap<>();
        week.put("sun", 0);
        week.put("mon", 1);
        week.put("tue", 2);
        week.put("wed",3);
        week.put("thu",4);
        week.put("fri",5);
        week.put("sat",6);
        String days[] = {"sun","mon","tue","wed","thu","fri","sat"};
        int Key = (week.get(Today)+(AfterDays%7))%7;
        System.out.println(days[Key]);
        
    }
}

package Calender;

public class DaysBtw {
    public static void daysBtw(int date1, int month1, int year1, int date2, int month2, int year2){
        int DaysOnMonth[] = {31,0,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        if(year1%4==0){
            DaysOnMonth[2] = 29;
        }
        else{
            DaysOnMonth[2] = 28;
        }
        if(year2>year1){
            if(month2>month1){
                
            }
        }
        
    }
}

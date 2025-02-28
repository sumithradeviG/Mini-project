package Calender;


public class DayonDate {
    private static String days[] = {"sun","mon","tue","wed","thu","fri","sat"};
    private static int years[] = {4,2,0,6};
    private static int month[] = {0,3,3,6,1,4,6,2,5,0,3,5};
    
    public static String NonLeap(int date, int mon, int year){
       
        int givenMonth = month[mon-1];
        int splitYear[] = new int[4]; 
        int temp = year;
        int strtDigitOfYear = 0;
        int lastDigitOfYear = 0;
        int yearCode;
        String ans;
        for(int i=0; i<4; i++){
            splitYear[i] =temp%10;
            temp = temp/10;
        }
        for(int j=splitYear.length-1; j>=0; j--){
            if(j==0 || j==1){
                lastDigitOfYear = lastDigitOfYear*10+splitYear[j];
            }
            else{
                strtDigitOfYear = strtDigitOfYear*10+splitYear[j];
            }
        }
        if(strtDigitOfYear%4 == 0){
            yearCode = years[3];
        }
        else{
            yearCode = years[strtDigitOfYear%4 - 1];
        }
        int quo = lastDigitOfYear/4;
        if(year%4 == 0 && mon<=2){
            ans = days[(date+givenMonth+yearCode+quo+lastDigitOfYear-1)%7];
        }
        else{
            ans = days[(date+givenMonth+yearCode+quo+lastDigitOfYear)%7];
        }
        return ans;
    }
}

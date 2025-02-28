import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

// CLASS TO STORE THE DEFAULT VALUES LIKE CREDIT POINTS, GRADE POINTS AND THE SUBJECTS OF EACH SEMESTER
class CreditsGradesAndSubcodes{
    // CREATE A METHOD TO STORE AND RETRIVE THE CREDIT VALUE 
    public double credit(Object s){
            double cre;
            Map<String, Double> credits = new HashMap<>();
            credits.put("BS3171", 2.0);
            credits.put("CY3151", 3.0);
            credits.put("GE3151", 3.0);
            credits.put("GE3171", 2.0);
            credits.put("HS3151", 3.0);
            credits.put("MA3151", 4.0);
            credits.put("PH3151", 3.0);

            credits.put("BE3254", 3.0);
            credits.put("EC3251", 4.0);
            credits.put("EC3271", 1.0);
            credits.put("GE3251", 4.0);
            credits.put("GE3271", 2.0);
            credits.put("HS3251", 2.0);
            credits.put("MA3251", 4.0);
            credits.put("PH3254", 3.0);

            credits.put("CS3353", 3.0);
            credits.put("CS3362", 1.5);
            credits.put("EC3351", 3.0);
            credits.put("EC3352", 4.0);
            credits.put("EC3353", 3.0);
            credits.put("EC3354", 4.0);
            credits.put("EC3361", 1.5);
            credits.put("GE3361", 1.0);
            credits.put("MA3355", 4.0);

            credits.put("EC3401", 4.0);
            credits.put("EC3451", 3.0);
            credits.put("EC3452", 1.5);
            credits.put("EC3461", 1.5);
            credits.put("EC3462", 3.0);
            credits.put("EC3491", 4.0);
            credits.put("EC3492", 2.0);
            credits.put("GE3451", 2.0);

            credits.put("CEC334", 3.0);
            credits.put("CEC340", 3.0);
            credits.put("CEC350", 3.0);
            credits.put("CEC366", 3.0);
            credits.put("EC3501", 4.0);
            credits.put("EC3551", 3.0);
            credits.put("EC3552", 3.0);
            credits.put("EC3561", 2.0);
            
            credits.put("SB8021", 2.0);
            credits.put("SB8052", 2.0);

            

            credits.put("HS3152", 3.0);
            credits.put("MA3151", 4.0);
            credits.put("PH3151", 3.0);
            credits.put("CY3151", 3.0);
            credits.put("GE3151", 3.0);
            credits.put("GE3152", 1.0);
            credits.put("GE3171", 2.0);
            credits.put("BS3171", 2.0);
            credits.put("GE3172", 1.0);

            credits.put("HS3252", 2.0);
            credits.put("MA3251", 4.0);
            credits.put("PH3254", 3.0);
            credits.put("BE3254", 3.0);
            credits.put("GE3251", 4.0);
            credits.put("EC3251", 4.0);
            credits.put("GE3252", 1.0);
            credits.put("GE3271", 2.0);
            credits.put("EC3271", 1.0);
            credits.put("GE3272", 2.0);

            credits.put("MA3355", 4.0);
            credits.put("CS3353", 3.0);
            credits.put("EC3354", 4.0);
            credits.put("EC3353", 3.0);
            credits.put("EC3351", 3.0);
            credits.put("EC3352", 4.0);
            credits.put("EC3361", 1.5);
            credits.put("EC3362", 1.5);
            credits.put("GE3361", 1.0);

            credits.put("EC3452", 3.0);
            credits.put("EC3401", 4.0);
            credits.put("EC3451", 3.0);
            credits.put("EC3492", 4.0);
            credits.put("EC3491", 3.0);
            credits.put("GE3451", 2.0);
            credits.put("EC3461", 1.5);
            credits.put("EC3462", 1.5);

            credits.put("EC3501", 4.0);
            credits.put("EC3552", 3.0);
            credits.put("EC3551", 3.0);
            credits.put("PE 1", 3.0);
            credits.put("PE 2", 3.0);
            credits.put("PE 3", 3.0);
            credits.put("EC3561", 2.0);

            credits.put("ET3491", 4.0);
            credits.put("CS3491", 4.0);
            credits.put("OE 1", 3.0);
            credits.put("PE 4", 3.0);
            credits.put("PE 5", 3.0);
            credits.put("PE 6", 3.0);

            credits.put("GE3791", 2.0);
            credits.put("MANAGEMENT PAPER", 3.0);
            credits.put("OE 2", 3.0);
            credits.put("OE 3", 3.0);
            credits.put("OE 4", 3.0);
            credits.put("EC3711 SUMMER INTERNSHIP", 2.0);

            credits.put("EC3811", 10.0);
            


        // THIS CONDITION STATEMENT RETURNS THE CREDIT OF GIVEN SUBJECT WHILE THE FUNCTION CALL   
        if (credits.containsKey(s)){
            cre = credits.get(s);
            return cre;
        }
        else{
            return 0;
        }
    }

    // CREATE A METHOD TO STORE AND RETRIVE THE GRADE POINTS 
    public int Grade(String m){
        switch (m) {
            case "O":case "o": return 10;
            case "A+":case "a+": return 9;
            case "A":case "a": return 8;
            case "B+":case "b+": return 7;
            case "B":case "b": return 6;
            case "C":case "c": return 5;
            default: return 0;
        }
    }

    // THIS METHOD CONTAINS THE SUBJECT DETAILS LIKE HOW MANY SUB FOR EACH SEM AND THE SUBJECT CODE
    @SuppressWarnings("rawtypes")
    public List semSub(int n){
        List<String> SubCode = new ArrayList<>();
        switch (n) {
            case 1:
                SubCode.add("MA3151");
                SubCode.add("PH3151");
                SubCode.add("CY3151");
                SubCode.add("GE3151");
                SubCode.add("GE3171");
                SubCode.add("BS3171");
                SubCode.add("HS3151");
                break;
            case 2:
                SubCode.add("HS3251");
                SubCode.add("MA3251");
                SubCode.add("PH3254");
                SubCode.add("BE3254");
                SubCode.add("GE3251");
                SubCode.add("EC3251");
                SubCode.add("GE3271");
                SubCode.add("EC3271");
                break;
            case 3:
                SubCode.add("MA3355");
                SubCode.add("CS3353");
                SubCode.add("EC3354");
                SubCode.add("EC3353");
                SubCode.add("EC3351");
                SubCode.add("EC3352");
                SubCode.add("EC3361");
                SubCode.add("CS3362");
                SubCode.add("GE3361");
                break;
            case 4:
                SubCode.add("EC3452");
                SubCode.add("EC3401");
                SubCode.add("EC3451");
                SubCode.add("EC3492");
                SubCode.add("EC3491");
                SubCode.add("GE3451");
                SubCode.add("EC3461");
                SubCode.add("EC3462");
                break;
            case 5:
                SubCode.add("EC3501");
                SubCode.add("EC3552");
                SubCode.add("EC3551");
                SubCode.add("PE 1");
                SubCode.add("PE 2");
                SubCode.add("PE 3");
                SubCode.add("EC3561");
                // SubCode.add("CEC340");
                // SubCode.add("SB8021");
                // SubCode.add("SB8052");
                break;
            case 6:
                SubCode.add("ET3491");
                SubCode.add("CS3491");
                SubCode.add("OE 1");
                SubCode.add("PE 4");
                SubCode.add("PE 5");
                SubCode.add("PE 6");
                break;
            case 7:
                SubCode.add("GE3791");
                SubCode.add("MANAGEMENT PAPER");
                SubCode.add("OE 2");
                SubCode.add("OE 3");
                SubCode.add("OE4");
                SubCode.add("EC3711 SUMMER INTERNSHIP");
                break;
            case 8:
                SubCode.add("EC3811");
                break;
            default:
                break;
        }
                return SubCode;
    }
}

// THIS CLASS IS TO CREATE AN ARRAY OF GRADE AND CREDIT POINTS 
class GradeAndCreditPoints{
    CreditsGradesAndSubcodes cred = new CreditsGradesAndSubcodes();

    // TO CALCULATE GRADEPOINTS FOR CGPA/GPA
    @SuppressWarnings({ "rawtypes", "unchecked", "resource" })
    public List Grepnts(int n, boolean iscgpa, boolean islateral, boolean isAddCourseDone, int noOfAddCourse, boolean isHonorOrMinorCourseDone, int noOfHonorOrMinorPaper){
        
        List GradePoints = new ArrayList<>();
        int start;

        if(iscgpa == true){
            start = islateral ? 3:1;
        }
        else{
            start = n;
        }

        for(int i=start; i<=n; i++){
            List SubCode1 = cred.semSub(i);
            for(int j=0; j<SubCode1.size(); j++){
                System.out.println("Enter the grade obtained in " + SubCode1.get(j) + ": ");
                Scanner sc = new Scanner(System.in);
                String m = sc.nextLine().toUpperCase();
                GradePoints.add(cred.Grade(m));
            }
        }

        if(isAddCourseDone){

            if(noOfAddCourse == 2){
                System.out.println("Enter the highest grade obtained in naan mudhalvan course ");
                Scanner scanner = new Scanner(System.in);
                String highestGrade = scanner.nextLine();
                int highestGradeOfAddCourse = cred.Grade(highestGrade);

                System.out.println("Enter the grade of another one");
                Scanner scanner1 = new Scanner(System.in);
                String lowestGrade = scanner1.nextLine();
                int lowestGradeOfAddCourse = cred.Grade(lowestGrade);

                int gradeOfAddCourse = ((2*highestGradeOfAddCourse)+(lowestGradeOfAddCourse))/3;

                GradePoints.add(gradeOfAddCourse);
            }
            else if(noOfAddCourse == 3){
                System.out.println("Enter the grade of first course");
                Scanner scanner2 = new Scanner(System.in);
                String gradeOfCourse1 = scanner2.nextLine();
                int gradePointOfCourse1 = cred.Grade(gradeOfCourse1);

                System.out.println("Enter the grade of 2nd course");
                Scanner scanner3 = new Scanner(System.in);
                String gradeOfCourse2 = scanner3.nextLine();
                int gradePointOfCourse2 = cred.Grade(gradeOfCourse2);

                System.out.println("Enter the grade of 3rd course");
                Scanner scanner4 = new Scanner(System.in);
                String gradeOfCourse3 = scanner4.nextLine();
                int gradePointOfCourse3 = cred.Grade(gradeOfCourse3);

                int gradeOfAddCourse = (gradePointOfCourse1 + gradePointOfCourse2 + gradePointOfCourse3)/3;

                GradePoints.add(gradeOfAddCourse);
            }
        }

        if(isHonorOrMinorCourseDone){
            for(int i=1; i<=noOfHonorOrMinorPaper; i++){
                System.out.println("Enter the grade of paper" + i);
                Scanner scanner5 = new Scanner(System.in);
                String gradeOfHonorsOrMinorPaper = scanner5.nextLine();
                GradePoints.add(cred.Grade(gradeOfHonorsOrMinorPaper));
            }
        }

        return GradePoints;
    }

    // TO CALCULATE CREDIT POINTS FOR CGPA/GPA
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List crepnts(int n, boolean iscgpa, boolean islateral, boolean isAddCourseDone, int noOfAddCourse, boolean isHonorOrMinorCourseDone, int noOfHonorOrMinorPaper){

        List CreditPoints = new ArrayList<>();

        int start;

        if(iscgpa == true){
            start = islateral ? 3:1;
        }
        else{
            start = n;
        }

        for(int i=start; i<=n; i++){
            List SubCode1 = cred.semSub(i);
            for(int j=0; j<SubCode1.size(); j++){
                CreditPoints.add(cred.credit(SubCode1.get(j)));
            }
        }

        if (isAddCourseDone) {
            if(noOfAddCourse == 2){
                CreditPoints.add(3.0);
            }
            else if(noOfAddCourse == 3){
                CreditPoints.add(6.0);
            }
        }

        if(isHonorOrMinorCourseDone){
            for(int i=1; i<=noOfHonorOrMinorPaper; i++){
                CreditPoints.add(3.0);
            }
        }
        return CreditPoints;
    }

}

class Calculation{
    GradeAndCreditPoints GpCp = new GradeAndCreditPoints();
    @SuppressWarnings("unchecked")
    public double Gpa(int n, boolean iscgpa, boolean islateral, boolean isAddCourseDone, int noOfAddCourse, boolean isHonorOrMinorCourseDone, int noOfHonorOrMinorPaper){

        List<Integer> gp = GpCp.Grepnts(n, iscgpa, islateral, isAddCourseDone, noOfAddCourse, isHonorOrMinorCourseDone, noOfHonorOrMinorPaper);
        List<Double> cp = GpCp.crepnts(n, iscgpa, islateral, isAddCourseDone, noOfAddCourse, isHonorOrMinorCourseDone, noOfHonorOrMinorPaper);

        double numerator =0, denominator =0;

        for(int i=0; i<gp.size();i++){
            numerator += gp.get(i)*cp.get(i);
            denominator += cp.get(i);
        }
        double gpa = numerator/denominator;
        return gpa;
    }
}

public class Cgpa {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Calculation calc = new Calculation();

        System.out.println("Which semester?");
        Scanner sc = new Scanner(System.in);
        int semester = sc.nextInt();

        System.out.println("What do you want to calculate gpa or cgpa? ");
        Scanner sca = new Scanner(System.in);
        String gpaOrCgpa = sca.nextLine().toLowerCase();
        boolean iscgpa = gpaOrCgpa.equals("cgpa");
        boolean islateral = false;
        if(iscgpa){
            System.out.println("Are you a lateral entry student? if Yes type 'YES' else 'NO' ");
            Scanner scan = new Scanner(System.in);
            String Lateral = scan.nextLine().toLowerCase();
            islateral = Lateral.equals("yes");
        }

        System.out.println("Have you completed any additional courses like NAAN MUDHALVAN? say yes or no");
        Scanner scann = new Scanner(System.in);
        String additionalCourse = scann.nextLine();
        boolean isAddCourseDone = additionalCourse.equals("yes") || additionalCourse.equals("YES");
        int noOfAddCourse = 0;
        if(isAddCourseDone){
            System.out.println("How many courses have you done? ");
            Scanner scanne = new Scanner(System.in);
            noOfAddCourse = scanne.nextInt();
        }
        
        boolean isHonorOrMinorCourseDone = false;
        int noOfHonorOrMinorPaper = 0;
        if(semester>4){
            System.out.println("Have you completed any Honors or minors paper? say yes or no");
            Scanner scanne = new Scanner(System.in);
            String honorOrMinorCourse = scanne.nextLine();
            isHonorOrMinorCourseDone = honorOrMinorCourse.equals("yes") || additionalCourse.equals("YES");
            if(isHonorOrMinorCourseDone){
                System.out.println("How many papers have you done? ");
                Scanner scanner = new Scanner(System.in);
                noOfHonorOrMinorPaper = scanner.nextInt();
            }           
        }
        
        double res = calc.Gpa(semester, iscgpa, islateral, isAddCourseDone, noOfAddCourse, isHonorOrMinorCourseDone, noOfHonorOrMinorPaper);
        System.out.println(res);
        
    }
}

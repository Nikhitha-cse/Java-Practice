import java.util.*;
public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char choice='y';
        while(choice == 'y'){
        System.out.println("Enter Student Name: ");
        String name=sc.next();
        
        System.out.println("Enter Marks : ");
        int[] marks=new int[5];
        try{
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! please enter only numbers");
        return;
        }
        
        int total=total(marks);
        System.out.println("Student Name: " + name);
            System.out.println("Total Marks: " + total);
        
        double avg=average(marks);
        System.out.println("Average: " + avg);

        int highest=highestMark(marks);
        System.out.println("Highest Marks: " + highest);

        int lowest=lowestMark(marks);
        System.out.println("Lowest Marks: " + lowest);

        char grade=grade(avg);
        System.out.println("Grade: " + grade);

        int pass=passcount(marks);
        System.out.println("Passed Subjects: " + pass);

        int f=failcount(marks);
        System.out.println("Failed Subjects: " + f);

        String sts=Status(f);
        System.out.println("Result Status: " + sts);

        double p=Percentage(total);
        System.out.println("Percentage: " + p);

        String rm=remarks(p);
        System.out.println("Remarks: " + rm);

        displayReport(name, marks, total, avg, highest, lowest, grade, pass, f, p,rm,sts);


        System.out.println("Do you want to enter another student? (y/n)");
        choice=sc.next().charAt(0);
        }
        System.out.println("Thank you for using Student Grade System");

    }
    static int total(int[] marks){
       int total=0;
       for(int i=0;i<marks.length;i++){
        total += marks[i];
       }
        return total;
        }
    static int highestMark(int[] marks){
        int highest=marks[0];
        for(int i=0;i<5;i++){
            if(highest < marks[i]){
                highest=marks[i];
            }
        }
        return highest;
        }
    static double average(int[] marks) {
      int sum=total(marks);
      double avg=sum/5.0;
      return avg;
    }
    static char grade(double avg){
       if(avg >= 90){
        return 'A';
       }
       else if(avg >= 75){
        return 'B';
       }
       else if(avg >= 60){
        return 'C';
       }
       else if(avg >= 50){
        return 'D';
       }
       else {
        return 'F';
       }

        }
        static int lowestMark(int[] marks){
        int lowest=marks[0];
        for(int i=1;i<marks.length;i++){
          if(lowest > marks[i]){
            lowest=marks[i];
          }
        }
        return lowest;
       }

       static void displayReport(String name,int[] marks,int total, double avg,int highest,int lowest, char grade, int pass, int f,double p,String rm,String status) {
        System.out.println("--------Student Report---------");
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " );
        for(int i=0;i<marks.length;i++){
          System.out.println("Subject " + (i + 1) + ": " + marks[i]);
       }
       System.out.println("Total: " + total);
       System.out.println("Average: " + avg); 
       System.out.println("Highest : " + highest);
       System.out.println("Lowest: " + lowest);
       System.out.println("Grade: " + grade);
       System.out.println("Passed Subjects: " + pass);
       System.out.println("Failed Subjects: " + f);
       System.out.println("Percentage: " + p);
       System.out.println("Remarks: " + rm);
                 
              }
       static int passcount(int[] marks){
        int count=0;
        for(int i=0;i<marks.length;i++){
            if(marks[i] >= 35){
                count++;
            }
        }
            return count;
        
       }
       static int failcount(int[] marks) {
        int fail=0;
        for(int i=0;i<marks.length;i++){
            if(marks[i] < 35){
                fail++;
            }
        }
        return fail;
       }
       static String Status(int failcount){
        if(failcount == 0){
           return "PASS";
        }else {
            return "FAIL";
        }
       }
       static double Percentage(int total){
        double per=(total / 500.0) * 100;
        return per;
       }

        static String remarks(double Percentage){
            double per=Percentage;
            if(per >= 90){
                return "Excellent";
            }
            else if(per >= 80 && per <=89){
                return "Very Good";
            }
            else if(per >= 70 && per <= 79){
                return "Average";
            }
            else{
                return "Needs Improvement";
            }
        }
}  






        
        

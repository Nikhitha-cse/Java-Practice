import java.util.Scanner;
public class checkNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(n>0){
         System.out.println("It is positive");
        }
        else if(n<0){
            System.out.println("It is negative");
        }
      else  {
            System.out.println("It is zero");
        }
        sc.close();
    }
}
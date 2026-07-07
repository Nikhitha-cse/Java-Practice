import java.util.*;
public class Traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sides: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a + b > c && b + c > a && c + a > b){
            System.out.println("Valid Traingle");
        } else {
            System.out.println("Invalid ");
        }

    }
}
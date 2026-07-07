import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int num=sc.nextInt();
        for(int n=1;n<=10;n++) {
           int res= num * n;
         System.out.println(num + "*" + n + "=" + res);
        }
    }
}
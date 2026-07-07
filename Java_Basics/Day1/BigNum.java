import java.util.*;
public class BigNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int big=0;
        if (a > b) {
            big = a;

        } else if (big > c) {
            c = big;
        }
        System.out.println(c + " is a biggest number");
    }
}
import java.util.Scanner;
public class Palli{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int rev=0;
            int original=n;
            while(n>0){
               int digit=n % 10;
               rev=rev * 10 + digit;
               n=n / 10;
            }
            if(original == rev) {
                System.out.println("It is a pallindrome");
            } else {
                System.out.println("It is not a pallindrome");
            }
        }
}
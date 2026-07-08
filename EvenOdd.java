import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evencount=0;
        int oddcount=0;
        while(n>0){
            int digit=n % 2;
            if(digit % 2==0){
                evencount++;
            } else{
                oddcount++;
            }
            n=n / 10;
        }
            System.out.println("Even: " + evencount);
            System.out.println("Odd: " + oddcount);

        
    }
}
import java.util.*;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ori=n;
        int count=0;
        int sum=0;
        while(n> 0){
            int digit=n % 10;
            count++;
            n= n / 10;
         }
        n=ori;
        while(n > 0){
            int digit=n%10;
            sum=sum+(int)Math.pow(digit,count);
            n=n/10;
        }
        if(ori==sum){
            System.out.println("Armstrong");
        } else{
            System.out.println("Not Armstrong");
        }
         }
}
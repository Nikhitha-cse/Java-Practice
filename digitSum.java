import java.util.Scanner;
public class digitSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("Sum: " + sum);
    }
}
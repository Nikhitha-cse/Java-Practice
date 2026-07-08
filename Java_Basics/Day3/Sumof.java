import java.util.*;
public class Sumof{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        do{
          sum=sum + i;
          i++;
        }while(i<= n);
        System.out.println("Sum: " + sum);
    }
}
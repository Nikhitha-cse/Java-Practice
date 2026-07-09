import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size: " );
        int n=sc.nextInt();
        double sum=0;
        double avg=0;
        System.out.println("Enter Elements:");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            sum=sum + arr[i];
        }
            avg=sum / arr.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}
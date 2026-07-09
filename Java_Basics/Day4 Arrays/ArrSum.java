import java.util.*;
public class ArrSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Array size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
         System.out.println("Elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        sum=sum+arr[i];
        System.out.println(" ");
           
        }
        System.out.println("Sum of all Elememts: "+ sum);
       
    }
}
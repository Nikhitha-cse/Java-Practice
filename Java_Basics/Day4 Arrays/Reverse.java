import java.util.*;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        System.out.println("elements are:");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Reversed Array is: ");
        for(int i=arr.length-1;i >=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
import java.util.*;
public class SecondLarge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Array size: ");
        int n=sc.nextInt();
        System.out.println("Elements :");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int large=arr[0];
        int secLarge=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > large){
                secLarge=large;
                large=arr[i];
                }
                else if(arr[i] < large && arr[i] > secLarge){
                   secLarge=arr[i];
                }
              }
            System.out.println("Large num is: " + large);
            System.out.println("Second Large num is: " + secLarge);
        }
    }

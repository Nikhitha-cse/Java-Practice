import java.util.*;
public class Small{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Arr size:");
        int n=sc.nextInt();
        System.out.println("Enter nums:");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
              if(arr[i]<small){
                small=arr[i];
            }
            }
             System.out.println("Smallest: " + small);
              } 
}
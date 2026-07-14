import java.util.*;
public class Dupliremove{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter arr size");
    int n=sc.nextInt();
    System.out.println("Elements: ");
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Array is: ");
   
    for(int i=0;i<arr.length;i++){
        int count=0;
        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
               count++;
              }
               }
      if(count==0){
       System.out.print(arr[i] + " ");
      }
 }
    }
}
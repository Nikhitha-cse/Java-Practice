import java.util.*;
public class Merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of first arr : ");
        int[] arr1=new int[n];
        for (int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of second arr : ");
        int[] arr2=new int[n];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int[] arr3= new int[arr1.length + arr2.length];
         for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
         }
         for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
         }
         System.out.println("Merged arr: ");
         for(int i=0;i<arr3.length;i++){
         System.out.print(arr3[i] + " ");
         }
         
   }
}
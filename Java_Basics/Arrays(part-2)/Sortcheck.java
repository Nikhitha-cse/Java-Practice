import java.util.*;
public class Sortcheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        int[] arr=new int[n];
        boolean sorted=true;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i + 1]){
                sorted=false;
            }
        }
            
            if(sorted==true) {
                System.out.println("Array is sorted");
            }
            else{
                System.out.println("Array not sorted");
            }
             }
}
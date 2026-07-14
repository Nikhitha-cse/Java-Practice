import java.util.*;
public class Counting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size:");
        int n=sc.nextInt();
        System.out.println("Enter arr elements:");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         int positive=0;
         int negative=0;
         int zero=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i] > 0) {
                positive++;
            } else if(arr[i] < 0) {
                negative++;
            } else{
                zero++;
            }
         }
         
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zero);
         }
}
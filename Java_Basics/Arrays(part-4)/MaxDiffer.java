import java.util.*;
public class MaxDiffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
            }
            int max=arr[0];
            int min=arr[0];
            int differ=0;
            for(int i=1;i<n;i++){
                if(max < arr[i]){
                    max=arr[i];
                    }
                if(min > arr[i]){
                    min=arr[i];
                }
            }
            differ=max-min;
            System.out.println("Maximum no:" + max);
            System.out.println("Minimum no:" + min);
            System.out.println("Max Difference: " + differ);
    }
}
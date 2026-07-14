import java.util.*;
public class SecSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size: ");
        int n=sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt();
        }
        int small=arr[0];
        int SecSmall=Integer.MAX_VALUE;;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                SecSmall=small;
                small=arr[i];
            } else if(arr[i]>small && arr[i]<SecSmall) {
                SecSmall=arr[i];
            }
        }
        System.out.println("Smallest element : " + small);
        System.out.println("Second smallest: " + SecSmall);
    }
}
import java.util.*;
public class Large{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size:");
        int n=sc.nextInt();
        System.out.println("Elements are: ");
        int[] arr=new int[n];
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i] > large) {
                large=arr[i];
            }
        }
            System.out.println("Largest element: " + large);
    }
}
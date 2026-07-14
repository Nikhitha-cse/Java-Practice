import java.util.*;
public class Copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        
        int[] copy=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(copy[i]);
        }
        }
    }

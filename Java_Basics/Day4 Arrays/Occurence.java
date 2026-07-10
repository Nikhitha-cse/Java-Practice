import java.util.*;
public class Occurence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Elements are: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Search: ");
        int search=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == search){
              count++;
            }
        }
        System.out.println(search + " appears" + count + " times");

    }
}
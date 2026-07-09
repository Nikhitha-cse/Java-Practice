import java.util.*;
public class Read{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Arraysize:");
        int n=sc.nextInt();
        System.out.println("Enter a array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Access element by Index: ");
        int index=sc.nextInt();
        if(index >= 0 && index < arr.length){
        System.out.println("The element at index: " + arr[index]);
        } else {
            System.out.println("Invalid index!");
        }
         }
}
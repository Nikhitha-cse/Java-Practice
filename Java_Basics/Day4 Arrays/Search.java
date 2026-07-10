import java.util.*;
public class Search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size: ");
        int n=sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter num to search: ");
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == search) {
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Element is found");
        } else{
            System.out.println("Element not found");
        }
    }
}
import java.util.*;
public class Equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr1 size");
        int n1=sc.nextInt();
        System.out.println("Enter arr2 size");
        int n2=sc.nextInt();

        System.out.println("enter arr1 values: ");
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        
        System.out.println("enter arr2 values: ");
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        boolean equal=true;
       if(n1 != n2) {
        System.out.println("Arrays not equal");
       } else {
        for(int i=0;i<n1;i++){
            if(arr1[i] != arr2[i]){
                equal=false;
            }
        }
       }
        if(equal){
            System.out.println("Arrays are equal");
        }
            else{
                System.out.println("Arrays not equal");
            }
      }

    }

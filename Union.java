import java.util.*;
public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a arr1 size: ");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];

        System.out.println("Enter a arr2 size: ");
         int n2=sc.nextInt();
        int[] arr2=new int[n2];

        System.out.println("arr1 elements are: ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
            }
             System.out.println("arr2 elements are: ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
            }
            for(int i=0;i<n1;i++){
                boolean found=false;
                for(int j=0;j<i;j++){
                    if(arr1[i]==arr1[j]){
                        found=true;
                        break;
                    }
                }
                    if(found==false){
                 System.out.print(arr1[i] + " " );
                    
                }  
            }
            for(int i=0;i<n2;i++){
                boolean found=false;
                for(int j=0;j<n1;j++){
                     if(arr2[i]==arr1[j]){
                        found=true;
                        break;
                     }
                }
                if(found==false){
                    System.out.print(arr2[i] + " ");
                }
            }
            }
}
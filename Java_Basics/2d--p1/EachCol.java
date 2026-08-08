import java.util.*;
public class EachCol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int[][] arr=new int[n1][n2];
        for(int i=0;i<n1;i++) {
            for(int j=0;j<n2;j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n1;i++) {
            for(int j=0;j<n2;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Largest element in each col");
            for(int j=0;j<n2;j++){
                int large=arr[0][j];
                for(int i=0;i<n1;i++){
                if(large < arr[i][j]){
                    large=arr[i][j];
                }
                }
                System.out.print(large);
            System.out.println();
        }
        System.out.println("Smallest elemente in each col");
        for(int j=0;j<n2;j++){
            int small=arr[0][j];
            for(int i=0;i<n1;i++){
                if(small > arr[i][j]){
                    small=arr[i][j];
                }
            }
            System.out.print(small);
            System.out.println();
        }
    }
}

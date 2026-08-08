import java.util.*;
public class EachRow {
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
        System.out.println("Largest value in each row");
        for(int i=0;i<n1;i++){
            int large=arr[i][0];
            for(int j=0;j<n2;j++){
             if(large < arr[i][j]){
                large=arr[i][j];
             }
            }
             System.out.print(large + " ");
           System.out.println();
        }
        System.out.println("Smallest value in each row");
        for(int i=0;i<n1;i++){
             int small=arr[i][0];
            for(int j=0;j<n2;j++){
                if(small > arr[i][j]){
                    small=arr[i][j];
                }
            }
            System.out.print(small + " ");
            System.out.println();
        }
        }
    }

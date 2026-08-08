import java.util.*;
public class Matrixadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[][] arr1=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix 1: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        n1=sc.nextInt();
         n2=sc.nextInt();
        int[][] arr2=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix 2: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        int[][] result=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                result[i][j]=arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of matrices is: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }



    }
}
import java.util.*;
public class DiagoSum {
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
        System.out.println("Sum of Diagonl elements are: ");
        int sum=0;
        for(int i=0;i<n1;i++) {
            sum=sum+arr[i][i];
               }
             System.out.print( sum);
        }
}

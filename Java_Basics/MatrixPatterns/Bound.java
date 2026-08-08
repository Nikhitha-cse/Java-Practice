import java.util.*;
public class Bound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[][] arr=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Boundary values are: ");
        int top=0;
        int right=n2-1;
        int bottom=n1-1;
        int left=0;

        for(int i=top;i<=right;i++){
            System.out.print(arr[top][i]);
        }
        for(int i=top+1;i<=bottom;i++){
          System.out.print(arr[i][right]);
           }
        for(int i=right-1;i>=left;i--){
            System.out.print(arr[bottom][i]);
        }
        for(int i=bottom-1;i>=top+1;i--){
            System.out.print(arr[i][left]);
        }



    }
}
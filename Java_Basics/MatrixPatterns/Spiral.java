import java.util.*;
public class Spiral {
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
        int top=0;
        int bottom=n1-1;
        int left=0;
        int  right=n2-1;

        while(top <= bottom && left <= right) {

            for(int i=left;i<=right;i++){
              System.out.print(arr[top][i] + " ");
            }
              top++;
            
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right] + " ");
            }
                right--;
            
            if(top <= bottom){
            for(int i=right;i>= left;i--){
                System.out.print(arr[bottom][i] + " ");
            }
                bottom--;
        }
            if(left <= right){
            for(int i=bottom;i>=top;i--){
                System.out.print(arr[i][left] + " ");
            }
                left++;
            }
            
        }
        sc.close();
    }
}
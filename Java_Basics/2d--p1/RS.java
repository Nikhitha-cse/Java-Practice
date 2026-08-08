import java.util.*;
public class RS{
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
        for(int i=0;i<n1;i++){
            int sum=0;
            for(int j=0;j<n2;j++){
                sum=sum+arr[i][j];

            }
            System.out.print(sum);
            System.out.println();
        }

     
    }
}

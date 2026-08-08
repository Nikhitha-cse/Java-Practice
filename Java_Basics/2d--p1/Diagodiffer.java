import java.util.*;
public class Diagodiffer{
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
       int mainsum=0;
       int secsum=0;
       for(int i=0;i<n2;i++){
        mainsum =mainsum + arr[i][i];
        secsum=secsum + arr[i][n2-1-i];
       }
       int differ=Math.abs(mainsum-secsum);
       System.out.println("Difference is: " + differ);
       
    }
}
import java.util.*;
public class Jagged1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row=sc.nextInt();
        int[][] arr=new int[row][];

         for(int i=0;i<row;i++){
            System.out.print("Enter no of cols for each row " + (i + 1) + ": ");
            int col=sc.nextInt();
            arr[i]=new int[col];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
           }
         for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
              System.out.print(arr[i][j] + " ");
            } 
            System.out.println();
             }
             int sum=0;
             for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
             }
            System.out.print(sum);
             

        }
} 
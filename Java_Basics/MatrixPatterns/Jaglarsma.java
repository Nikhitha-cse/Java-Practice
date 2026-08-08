import java.util.*;
public class Jaglarsma {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows=sc.nextInt();
        int[][] arr=new int[rows][];

        for(int i=0;i<rows;i++){
            System.out.println("Enter no of cols for each row " + (i + 1) + ": ");
            int cols=sc.nextInt();
            arr[i]=new int[cols];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<arr.length-1;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int large=arr[0][0];
        int small=arr[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0;j<arr.length-1;j++){
            if(large < arr[i][j]){
                large=arr[i][j];
            } else{
                small=large;
            }
             }
        }
             System.out.println("Large element is: " + large);
             System.out.println("Small element is: " + small);

        

    }
}
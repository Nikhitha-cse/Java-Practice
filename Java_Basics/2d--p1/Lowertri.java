import java.util.*;
public class Lowertri{
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
        System.out.println("Lower Triangle values are: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(i>=j){
                    System.out.print(arr[i][j] + " ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    }
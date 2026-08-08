import java.util.*;
public class Symmetry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1!=n2){
         System.out.println("The matrix is not Square");
        } 

        int[][] arr=new int[n1][n2];   
           for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        boolean isSymmetry=true;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr[i][j]!= arr[j][i]){
                 isSymmetry=false;     
                }
            }
        }
        if(isSymmetry==true){
            System.out.println("The matrix is symmetric");
        } else{
            System.out.println("The matrix is not symmetric");
        }
    }  
    }

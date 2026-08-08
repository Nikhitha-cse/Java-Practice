import java.util.*;
public class Equal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();

        int[][] m1=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        int[][] m2=new int[n3][n4];
        for(int i=0;i<n3;i++){
            for(int j=0;j<n4;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        if(n1 != n3 || n2 != n4){
            System.out.println("Matrix size not matched");
        return; 
        }

         boolean Equal=true;
        for(int i=0;i<n1;i++){
            for( int j=0;j<n2;j++){
                if(m1[i][j]!= m2[i][j]){
                    Equal=false;
        }
        }
        }
        if(Equal){
            System.out.println("Matrices are equal");
        } else {
            System.out.println("Matrices not equal");
        }

    }
}
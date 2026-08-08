import java.util.*;
public class Search{
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
        System.out.println("Enter a value to be searched");
        int search=sc.nextInt();
        boolean found=false;
        int row=-1;
        int col=-1;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
            if(search==arr[i][j]){
                found=true;
                row=i;
                col=j;
                break;
            }
            }
        }
        if(found){
            System.out.println("Element is found");
            System.out.println("Position is: " + "Row: " + row + "Col: " + col);
        }
        else{
            System.out.println("Not found");
        }
        

    }
}
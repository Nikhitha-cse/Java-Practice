import java.util.*;
public class Leader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[n-1];
        int[] leaders= new int[n];
        int count=0;

        leaders[count]=max;
        count++;

           System.out.println("Leader elements: " );
        for(int i=n-1;i>0;i--) {
            if(max < arr[i]) {
                max=arr[i];
                leaders[count]=max;
                count++;
            }
            } 
            for(int i=count-1;i>=0;i--) {
                System.out.print(leaders[i] + " ");
            }
    }
}
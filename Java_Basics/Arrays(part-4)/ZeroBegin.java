import java.util.*;
public class ZeroBegin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int index=n-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i] != 0){
                arr[index]=arr[i];
                index--;
            }
        }
        for(int i=0;i<=index;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
import java.util.*;
public class Missing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n-1];
            for(int i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
            }
            int expectedsum=0;
            for(int i=1;i<=n;i++){
                expectedsum=expectedsum + i;
                }
                int actualsum=0;
                for(int i=0;i<n-1;i++){
                   actualsum=actualsum+arr[i];
                }
                int num=expectedsum-actualsum;
                System.out.println("Num is:" + num);

        }
  }

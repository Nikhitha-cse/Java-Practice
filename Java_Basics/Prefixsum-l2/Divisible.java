import java.util.*;
public class Divisible {
    public static void main (String[] args)  {
        int[] a={4,5,0,-2,-3,1};
        int k=5;
        int count=0;
        for(int i=0;i<a.length;i++) {
            int sum=0;
            for(int j=i;j<a.length;j++) {
                sum=sum+a[j];
                if(sum % 5==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
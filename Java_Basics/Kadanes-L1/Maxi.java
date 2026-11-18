import java.util.*;
public class Maxi {
    public static void main(String[] args) {
        int[] a={2,1,5,1,3,2};
        int k=3;
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++) {
            cursum += a[i];
         }
        maxsum=cursum;
        for(int i=k;i<a.length;i++) {
            cursum -= a[i-k];
            cursum +=  a[i];
            maxsum=Math.max(maxsum,cursum);
        }
        System.out.println(maxsum);
    }
}
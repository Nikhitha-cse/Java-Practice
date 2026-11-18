import java.util.*;
public class Alternating {
    public static void main(String[] args) {
        int[] a={4,2,5,3};
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            int cursum=0;
            for(int j=i;j<a.length;j++) {
                if((j-i) % 2==0) {
                    cursum += a[j];
                } else{
                    cursum -= a[j];
                }
             maxsum=Math.max(cursum,maxsum);
        }
        }
            System.out.println(maxsum);
    }
}
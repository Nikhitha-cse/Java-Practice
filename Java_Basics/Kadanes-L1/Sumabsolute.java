import java.util.*;
public class Sumabsolute {
    public static void main(String[] args) {
        int[] a={2,-5,1,-4,3,-2};
        int maxEnd=0;
        int minEnd=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            maxEnd=Math.max(a[i],maxEnd+a[i]);
            maxsum=Math.max(maxsum,maxEnd);
            minEnd=Math.min(a[i],minEnd+a[i]);
            minsum=Math.min(minsum,minEnd);
            maxsum=Math.max(maxsum,Math.abs(minsum));
        }
        System.out.println(maxsum);
    }
}
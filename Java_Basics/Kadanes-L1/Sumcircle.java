import java.util.*;
public class Sumcircle {
    public static void main(String[] args) {
        int[] a={3,-1,4,-1};
        int totalsum=0;
        int curmax=0;
        int curmin=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            totalsum += a[i];
            curmin=Math.min(curmin+a[i],a[i]);
            minsum=Math.min(minsum,curmin);
            curmax=Math.max(curmax+a[i],a[i]);
            maxsum=Math.max(maxsum,curmax);
        }
        if(maxsum<0) {
            System.out.println(maxsum);
        }else{
            int circlesum=totalsum-minsum;
            maxsum=Math.max(circlesum,maxsum);
        }
        System.out.println(maxsum);

    }
}


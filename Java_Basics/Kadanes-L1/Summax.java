import java.util.*;
public class Summax{
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            cursum=Math.max(cursum+a[i],a[i]);
            maxsum=Math.max(cursum,maxsum);
        }
    System.out.println(maxsum);

    }
}
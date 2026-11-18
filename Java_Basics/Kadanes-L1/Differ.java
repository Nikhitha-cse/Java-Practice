import java.util.*;
public class Differ {
    public static void main(String[] args) {
        int[] a={2,3,10,6,4,8,1};
        int minval=a[0];
        int maxdif=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++) {
            int diff=a[i]-minval;
            maxdif=Math.max(diff,maxdif);
            if(a[i]<minval){
                minval=a[i];
            }
        }
        System.out.println(maxdif);
    }
}
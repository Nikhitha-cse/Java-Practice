import java.util.*;
public class Difference {
    public static void main(String[] args) {
        int[] a={2,3,10,6,4,8,1};
        int maxdif=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                int diff=a[j]-a[i];
                maxdif=Math.max(maxdif,diff);
            }
        }
        System.out.println(maxdif);

    }
}
import java.util.*;
public class Product {
    public static void main(String[] args) {
        int[] a={-2,3,4};
        int maxend=a[0];
        int minend=a[0];
        int maxpro=a[0];
        for(int i=1;i<a.length;i++) {
            int premax=maxend;
            int premin=minend;
            maxend=Math.max(a[i],Math.max(premax*a[i],premin*a[i]));
            minend=Math.min(a[i],Math.min(premin*a[i],premax*a[i]));
            maxpro=Math.max(maxend,minend);

        }
        System.out.println(maxpro);
    }
}
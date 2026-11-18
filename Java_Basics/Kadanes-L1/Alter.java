import java.util.*;
public class Alter {
    public static void main(String[] args) {
        int[] a={-4,-2,5,-3};
        long plus=a[0];
        long minus=Long.MIN_VALUE / 4;
        long maxsum=a[0];
        for(int i=1;i<a.length;i++) {
           long prevplus=plus;
           long prevminus=minus;
            plus=Math.max(a[i],prevminus+a[i]);
            minus=prevplus-a[i];
            maxsum=Math.max(maxsum,Math.max(plus,minus));
        }
        System.out.println(maxsum);


    }
}
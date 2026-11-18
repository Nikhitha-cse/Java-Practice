import java.util.*;
public class Absolutesum {
    public static void main(String[] args) {
        int[] a={2,-5,1,-4,3,2};
        int maxabssum=0;
        int abscursum=0;
        for(int i=0;i<a.length;i++) {
            int cursum=0;
            for(int j=i;j<a.length;j++) {
                cursum=cursum+a[j];
                abscursum=Math.abs(cursum);
                maxabssum=Math.max(maxabssum,abscursum);
            }
        }
        System.out.println(maxabssum);
    }
}
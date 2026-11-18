import java.util.*;
public class SellStock {
    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        int minprice=a[0];
        int maxprofit=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++) {
            minprice=Math.min(minprice,a[i]);
            int curprofit=a[i]-minprice;
            maxprofit=Math.max(curprofit,maxprofit);
        }
        System.out.println(maxprofit);
    }
}
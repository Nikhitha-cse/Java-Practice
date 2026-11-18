import java.util.*;
public class Circlesum {
    public static void main(String[] args) {
        int[] a={4,-5,6};
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            int cursum=0;
            for(int j=0;j<a.length;j++) {
                int index=(i+j)%a.length;
                cursum=cursum+a[index];
                if(cursum>maxsum) {
                    maxsum=cursum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
import java.util.*;
public class Range {
    public static void main(String[] args) {
        int[] a={-2,5,-1};
        int lower=-2;
        int upper=2;
        int count=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++) {
                sum=sum+a[j];
                if(sum >= lower && sum <= upper) {
                  count++;
                }
            }
        }
        System.out.println(count);
    }
}
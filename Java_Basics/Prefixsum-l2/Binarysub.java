import java.util.*;
public class Binarysub {
    public static void main(String[] args) {
        int[] a={1,0,1,0,1};
        int goal=2;
        int count=0;
        for(int i=0;i<a.length;i++) {
            int sum=0;
            for(int j=i;j<a.length;j++) {
                sum=sum+a[j];
                if(sum==goal) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
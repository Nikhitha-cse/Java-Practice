import java.util.*;
public class Maxsum {
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=0;
        for(int i=0;i<a.length;i++) {
            int sum=0;
            for(int j=i;j<a.length;j++) {
                sum=sum+a[j];
                if(sum > maxsum){
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum);

    }
}
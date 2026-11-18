import java.util.*;
public class Maximum {
    public static void main(String[] args) {
        int[] a={1,2,1,2,6,7,5,1};
        int k=2;
        int maxsum=0;
        for(int i=0;i<=a.length-k;i++) {
            for(int j=i+k;j<=a.length-k;j++) {
                 for(int l=j+k;l<=a.length-k;l++) {
                    int sum1=a[i]+a[i+1];
                    int sum2=a[j]+a[j+1];
                    int sum3=a[l]+a[l+1];

                    int total=sum1+sum2+sum3;
                    maxsum=Math.max(total,maxsum);

                }
            }
        }
        System.out.println(maxsum);
    }
}
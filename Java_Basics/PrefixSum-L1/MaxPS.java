import java.util.*;
public class MaxPS{
    public static void main(String[]args) {
    int[] a={2,-1,4,-3,5};
    int sum=a[0];
    int minsum=a[0];
    for(int i=1;i<a.length;i++) {
        a[i]=sum+a[i];
        sum=a[i];
    }  
    int maxsum=a[0];
    maxsum=Math.max(sum,maxsum);
    minsum=Math.min(sum,minsum);
    System.out.println("MAX: " + maxsum + ", " + "MIN: " + minsum);
   
}

}

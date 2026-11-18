import java.util.*;
public class Operation {
    public static void main(String[] args) {
        int[] a={1,-2,0,3};
        int maxsum=a[0];
        int nodelete=a[0];
        int onedel=0;
        for(int i=1;i<a.length;i++) {
            int prenodel=nodelete;
            int preonedel=onedel;
            nodelete=Math.max(a[i],prenodel+a[i]);
            onedel=Math.max(preonedel+a[i],prenodel);
            maxsum=Math.max(nodelete,onedel);
        }
        System.out.println(maxsum);
    }
}
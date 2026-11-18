import java.util.*;
public class Deletionsum {
    public static void main(String[] args) {
        int[] a={2,-1,-2,3};
        int maxsum=a[0];
        int nodelete=a[0];
        int onedelete=0;
        for(int i=1;i<a.length;i++) {
            int prenodel=nodelete;
            nodelete =Math.max(nodelete+a[i],a[i]);
            onedelete=Math.max(prenodel,onedelete+a[i]);
           maxsum=Math.max(maxsum,Math.max(nodelete,onedelete));
        }
        System.out.println(maxsum);

    }
}
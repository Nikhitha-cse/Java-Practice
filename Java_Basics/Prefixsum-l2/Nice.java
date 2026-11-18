import java.util.*;
public class Nice {
    public static void main(String[] args) {
        int[] a={1,1,2,1,1};
        int k=3;
        int res=0;
        for(int i=0;i<a.length;i++) {
            int count=0;
            for(int j=i;j<a.length;j++) {
                if(a[j] % 2 != 0) {
                    count++;
                }
                if(count == k) {
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
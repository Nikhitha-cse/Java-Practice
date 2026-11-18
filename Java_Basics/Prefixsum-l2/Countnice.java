import java.util.*;
public class Countnice {
    public static void main(String[] args) {
        int[] a={1,1,2,1,1};
        int k=3;
        for(int i=0;i<a.length;i++) {
            if(a[i]%2==0) {
                a[i]=0;
            }else{
                a[i]=1;
            }
        }
        int oddcount=0;
        int count=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<a.length;i++) {
            if(a[i]==1) {
                oddcount++;
            }
            int need=oddcount-k;
            if(hm.containsKey(need)) {
                count=count+hm.get(need);
            }
            hm.put(oddcount,hm.getOrDefault(oddcount,0)+1);
        }
        System.out.println(count);
    }
}
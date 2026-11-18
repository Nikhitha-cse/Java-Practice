import java.util.*;
public class Longest {
    public static void main(String[] args) {
        int[] a={1,2,3,1,1,1,1};
        int k=3;
        int maxlen=0;
        int sum=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            int need=sum-k;
            if(hm.containsKey(need)){
                int len=i-hm.get(need);
                maxlen=Math.max(len,maxlen);
            }
            if(!hm.containsKey(sum)) {
                hm.put(sum,i);
            }
        }
        System.out.println(maxlen);

    }
}
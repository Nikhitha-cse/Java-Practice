import java.util.*;
public class xor {
    public static void main(String[] args) {
        int[] a={4,2,2,6,4};
        int k=6;
        Map<Integer,Integer> hm=new HashMap<>();
        int xor=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<a.length;i++) {
            xor=xor ^ a[i];
            int need=xor ^ k;
            if(hm.containsKey(need)) {
                count=count+hm.get(need);
            }
            hm.put(xor,hm.getOrDefault(xor,0)+1);
        }
        System.out.println(count);

    }
}
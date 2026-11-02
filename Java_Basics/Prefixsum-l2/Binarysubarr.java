import java.util.*;
public class Binarysubarr {
    public static void main(String[] args) {
        int[] a={1,0,1,0,1};
        int goal=2;
        Map<Integer,Integer> hm=new HashMap<>();
        int count=0;
        int sum=0;
        hm.put(0,1);
        for(int i=0;i<a.length;i++) {
            sum=sum+a[i];
            int need=sum-goal;
            if(hm.containsKey(need)) {
                count=count+hm.get(need);
            }
            if(hm.containsKey(sum)) {
                hm.put(sum,hm.get(sum)+1);
            }
            else{
                hm.put(sum,1);
            }
    }
    System.out.println(count);
}
}
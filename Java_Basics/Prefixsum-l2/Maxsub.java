import java.util.*;
public class Maxsub {
    public static void main(String[] args) {
        int[] a={1,2,3,1,1,1,1};
        int k=3;
        int maxlength=0;
        int sum=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(sum==k) {
                maxlength=Math.max(maxlength,i+1);
            }
            
             int need=sum-k;
            if(hm.containsKey(need)){
                int length=i-hm.get(need);
                maxlength=Math.max(maxlength,length);
            }
            hm.putIfAbsent(sum,i);
        }
        System.out.println(maxlength);

    }
}
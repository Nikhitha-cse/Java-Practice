import java.util.*;
public class countsubarr{
    public static void main(String[] args) {
        int[] a={0,1,0,1};
        int sum=0;
         int count=0;
         Map<Integer,Integer> hm= new HashMap<>();
          hm.put(0,1);
        for(int i=0;i<a.length;i++) {
            if(a[i]==0){
                sum=sum-1;
            } else{
                sum=sum+1;
            }
            if(hm.containsKey(sum)) {
                count=count+hm.get(sum);
            }
            {
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
        }
        System.out.println(count);
    }
}
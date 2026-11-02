import java.util.*;
public class subsum{
    public static void main(String[] args) {
        int[] a={1,2,3,1,1,1};
        int k=3;
        int sum=0;
        int count=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            int need=sum-k;
            if(hm.containsKey(need)){
                count=count+hm.get(need);
             }
             if(hm.containsKey(sum)){
                hm.put(sum,hm.get(sum)+1);
             }
             else{
                hm.put(sum,1);
             }
        }
        System.out.println(count);


    }
}
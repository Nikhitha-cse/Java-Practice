import java.util.*;
public class hm10{
    public static void main(String[] args){
        int[] a={1,2,3};
        int k=3;
        int count=0;
        int sum=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int x:a){
            sum=sum+x;
          int needed=sum-k;
            if(hm.containsKey(needed)){
                count=count + hm.get(needed);
                }
                hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(hm);
        System.out.println(count);
    }
}
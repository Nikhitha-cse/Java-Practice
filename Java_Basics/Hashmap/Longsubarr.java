import java.util.*;
public class Longsubarr{
    public static void main(String[] args){
        int[] a={2,-2,3,-3,4};
        int sum=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);

        int length=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(hm.containsKey(sum)){
                int curlen=i-hm.get(sum);
                if(curlen > length){
                    length=curlen;
                }
                  }else{
                hm.put(sum,i);
            }
        }
        System.out.println(length);
    }
}
import java.util.*;
public class Conti {
    public static void main(String[] args) {
        int[] a={0,1,0,1,1,0};
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        int max=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==0){
                sum=sum-1;
            } else{
                sum=sum+1;
            }
            if(hm.containsKey(sum)){
                int len=i-hm.get(sum);
                max=Math.max(max,len);
            }
            else{
                hm.put(sum,i);
            }
        }
        System.out.println(max);
    }
}
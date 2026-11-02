import java.util.*;
public class Equalzerosones{
    public static void main(String[] args){
        int[] a={0,1,0,1,1,0};
        int sum=0;
        int len=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<a.length;i++){
           if(a[i]==0){
            sum--;
           }else{
            sum++;
           }
           if(hm.containsKey(sum)){
            int curlen=i-hm.get(sum);
            if(curlen > len){
                len=curlen;
            }
           }else{
            hm.put(sum,i);
           }
  }
        System.out.println(len);
    }
}
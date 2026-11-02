import java.util.*;
public class Continue {
    public static void main(String[] args) {
        int[] a={23,2,4,6,7};
        int k=6;
        int sum=0;
        boolean res=false;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            int rem=sum % k;
            if(hm.containsKey(rem)){
                int len=i-hm.get(rem);
            
            if(len>=2){
                res=true;
                break;
            }
            }else{
                hm.put(rem,i);
            }

        }
        System.out.println(res);

    }
}
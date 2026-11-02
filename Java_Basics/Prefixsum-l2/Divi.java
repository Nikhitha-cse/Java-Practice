import java.util.*;
public class Divi {
    public static void main(String[] args) {
        int[] a={4,5,0,-2,-3,1};
        int k=5;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++) {
            sum=sum+a[i];
            int rem=((sum%k)+k)%k;
            if(hm.containsKey(rem)) {
                count=count+hm.get(rem);
                hm.put(rem,hm.get(rem)+1);
            }
            else{
                hm.put(rem,1);
            }
        }
        System.out.println(count);

    }
}
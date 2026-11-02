import java.util.*;
public class m1{
    public static void main(String[] args){
        int[] a={1,2,2,3,1,2,4,3};
        Map<Integer,Integer> hm=new HashMap<>();
        for(int x:a){
            if(hm.containsKey(x)){
              hm.put(x,hm.get(x) + 1);
            }else{
              hm.put(x,1);
            }
        }
        System.out.println(hm);
    }
}
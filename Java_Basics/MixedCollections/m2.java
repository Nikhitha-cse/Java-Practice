import java.util.*;
public class m2{
    public static void main(String[] args){
        int[] a={5,5,7,8,7,5,8};
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
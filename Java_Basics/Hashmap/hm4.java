import java.util.*;
public class hm4{
    public static void main(String[] args){
        Map<Integer,Integer> hm=new HashMap<>();
        int[] a={1,2,3,4,5};
        int[] b={3,4,5,6,7};
        for(int x : a){
            hm.put(x,1);
        }
        for(int x:b){
            if(hm.containsKey(x)){
                System.out.println(x);
            }
        }
    }
}
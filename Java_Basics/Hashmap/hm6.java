import java.util.*;
public class hm6{
    public static void main(String[] args){
        int[] a={1,1,1,2,2,3,4};
        int k=3;
      //  int size=a.length()/k;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int x:a){
           if(hm.containsKey(x)){
            hm.put(x,hm.get(x)+1);
           }else{
            hm.put(x,1);
           }
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
           if(e.getValue() > a.length / k){
            System.out.print(e.getKey());
           }

        }

    }
}

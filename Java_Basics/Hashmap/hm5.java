import java.util.*;
public class hm5{
    public static void main(String[] args){
        int[] a= {2,2,1,2,3,2,2};
        Map<Integer,Integer> hm=new HashMap<>();
       for(int x:a){
           if(hm.containsKey(x)){
            hm.put(x,hm.get(x)+1);
           }else{
            hm.put(x,1);
           }
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            int size=a.length/2;
            if(e.getValue() > size){
                System.out.println(e.getKey());
        }
    }   
    }
}

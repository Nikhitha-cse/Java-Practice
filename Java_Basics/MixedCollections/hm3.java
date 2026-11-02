import java.util.*;
public class hm3{
    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        m.put("Rahul",75);
        m.put("Priya",85);
        m.put("Anu",92);
        m.put("Ravi",68);
        for(Map.Entry<String,Integer> e:m.entrySet()){
           if(e.getValue() > 75){
            System.out.println(e.getKey() + " " + e.getValue());
            }
        }
 }
}
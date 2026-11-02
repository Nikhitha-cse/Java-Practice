import java.util.*;
public class hm9{
    public static void main(String[] args){
        Map<String ,Integer> m=new HashMap<>();
        m.put("Apple",50);
        m.put("Banana",30);
        m.put("Mango",70);
        m.put("Orange",40);
        for(Map.Entry<String,Integer> e:m.entrySet()){
            if(e.getValue()==70){
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }

    }
}
import java.util.*;
public class hm2{
    public static void main(String[] args){
        Map<String ,Integer> m=new HashMap<>();
        m.put("Apple",5);
        m.put("Banana",10);
        m.put("Mango",7);
       System.out.println(m.keySet());
       System.out.println(m.values());
       System.out.println(m.entrySet());
        
    }
}
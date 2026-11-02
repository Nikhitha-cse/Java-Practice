import java.util.*;
public class hm6{
    public static void main(String[] args){
        Map<String ,Integer> m=new HashMap<>();
        m.put("Apple",5);
        m.put("Banana",10);
        m.put("Mango",7);
        m.put("Orange",40);
        m.put("Banana",40);
        if(m.containsKey("Mango")){
            System.out.println("Mango is available");
        }
    }
}
import java.util.*;
public class hm10{
    public static void main(String[] args){
        Map<String ,Integer> m=new HashMap<>();
        m.put("Apple",50);
        m.put("Banana",30);
        m.put("Mango",70);
        m.put("Orange",40);
       if(m.containsValue(70)){
        System.out.println("Value exist");
       }
    }
}
import java.util.*;
public class hm4{
    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        m.put("Pen",20);
        m.put("Book",50);
        m.put("Bag",80);
        m.put("Pencil",10);
        for(Map.Entry<String,Integer> e:m.entrySet()){
            if(e.getValue() < 50){
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
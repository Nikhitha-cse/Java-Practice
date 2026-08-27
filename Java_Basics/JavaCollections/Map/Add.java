import java.util.*;
public class Add{
    public static void main(String[] args){
        HashMap<Integer, String> map=new HashMap<>();
        map.put(101,"Nikki");
        map.put(102,"Chintu");
        map.put(103,"Vaishu");
        System.out.println(map);
        System.out.println(map.get(102));
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("Vaishu"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove(102));
        System.out.println(map.size());
    }
}
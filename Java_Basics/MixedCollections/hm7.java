import java.util.*;
public class hm7{
    public static void main(String[] args){
        Map<String ,Integer> m=new HashMap<>();
        m.put("Apple",50);
        m.put("Banana",30);
        m.put("Mango",70);
        int sum=0;
        for(int x:m.values()){
            sum+=x;
        }
        System.out.println(sum);
    }
}
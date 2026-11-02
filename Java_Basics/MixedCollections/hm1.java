import java.util.*;
import java.util.HashMap;
public class hm1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String ,Integer> h=new HashMap<>();
        h.put("Apple",5);
        h.put("Banana",10);
        h.put("Mango",7);
        for(Map.Entry<String,Integer> entry:h.entrySet()){
           System.out.print(entry.getKey() + "-->" + entry.getValue()); 
            }
        }

        }
    

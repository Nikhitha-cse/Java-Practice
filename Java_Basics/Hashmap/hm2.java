import java.util.*;
public class hm2{
    public static void main(String[] args) {
      String s="swiss";
    Map<Character,Integer> hm=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(hm.containsKey(ch)){
            System.out.println(ch);
            break;
        }else{
            hm.put(ch,1);
            
        }
      }
    }
}
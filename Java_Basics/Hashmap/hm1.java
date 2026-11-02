import java.util.*;
public class hm1{
    public static void main(String[] args) {
        String s="swiss";
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
               hm.put(ch,hm.get(ch) + 1);
            }else{
                hm.put(ch ,1);
            }
        }
       // System.out.println(hm);
       for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(hm.get(ch) == 1){
             System.out.println(ch);
             break;
            }
        }
       }
}
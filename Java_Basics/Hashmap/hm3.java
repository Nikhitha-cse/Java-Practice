import java.util.*;
public class hm3{
    public static void main(String[] args) {
     String s="programming";
     Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
               hm.put(ch,hm.get(ch) + 1);
            }else{
                hm.put(ch ,1);
            }
        }
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(hm.get(ch) > 1){
                if(!set.contains(ch)){
                System.out.print(ch);
                set.add(ch);
                }
            }
    }
}
}
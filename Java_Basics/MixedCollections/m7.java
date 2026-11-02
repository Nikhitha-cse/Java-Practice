import java.util.*;
public class m7{
    public static void main(String[] args){
        String s="programming";
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch) + 1);
            }else{
                hm.put(ch,1);
            }
        }
       // System.out.println(hm);
        
        //int count=1;
        //char res=' ';
        for(Map.Entry<Character,Integer> e : hm.entrySet()){
            if(e.getValue() > 1){
              System.out.println(e.getKey());
            }
           
        }
      }
}
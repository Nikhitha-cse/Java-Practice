import java.util.*;
public class m6{
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
        System.out.println(hm);

        int max=0;
        int min=Integer.MAX_VALUE;
        char res=' ';
        for(Map.Entry<Character,Integer> e : hm.entrySet()){
          if(e.getValue() > max){
              max=e.getValue();
              res=e.getKey();
          }else if(e.getValue() < min){
            min=e.getValue();
            res=e.getKey();
          }
        }
        System.out.println(res);

    }
}
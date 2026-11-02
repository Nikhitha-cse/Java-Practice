import java.util.*;
public class m3{
    public static void main(String[] args){
        System.out.println("Enter string: ");
        String s="banana";
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
               hm.put(ch,hm.get(ch) + 1);
            } else{
                hm.put(ch,1);
            }
        }
        System.out.println(hm);
    }
}
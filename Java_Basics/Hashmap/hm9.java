import java.util.*;
public class hm9{
    public static void main(String[] args){
        String[] a={"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String>> hm=new HashMap<>();
        for(String word:a){
        char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(hm.containsKey(key)){
                hm.get(key).add(word);
            } else{
                List<String> l=new ArrayList<>();
                l.add(word);
                hm.put(key,l);
            }
        }
        System.out.println(hm.values());

    }
}
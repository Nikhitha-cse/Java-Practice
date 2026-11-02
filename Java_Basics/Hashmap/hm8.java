import java.util.*;
public class hm8{
    public static void main(String[] args){
        int[] a={100,4,200,1,3,2};
        Set<Integer> hs=new HashSet<>();
        for(int x:a){
            hs.add(x);
        }
        int longest=0;
        for(int x:a){
            if(!hs.contains(x-1)){
               int current=x;
                int count=1;
       while(hs.contains(current+1)){
                current++;
                count++;
            }
            if(count>longest){
             longest=count;
            }
                }
         }
         System.out.println(longest);

    }
}

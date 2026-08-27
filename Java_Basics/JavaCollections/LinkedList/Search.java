import java.util.LinkedList;
import java.util.Collections;
public class Search{
    public static void main(String[] args){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        System.out.println(l.contains(30));
        System.out.println(l.remove(Integer.valueOf(30)));
        System.out.println(l);
        System.out.println(l.set(2,30));
   System.out.println(l);
   System.out.println(l.size());
   Collections.reverse(l);
   System.out.println(l);
    }
}
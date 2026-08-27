import java.util.*;
public class Convert{
    public static void main(String[] args){
        HashSet<Integer> h=new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        ArrayList<Integer> al=new ArrayList<>(h);
        System.out.println(h);
        System.out.println(al);
        System.out.println(al.get(2));
    }
}
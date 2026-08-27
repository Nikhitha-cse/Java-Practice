import java.util.*;
public class Add{
    public static void main(String[] args){
        HashSet<Integer> h=new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(10);
        h.add(30);
        h.add(20);
        h.add(40);
        h.add(30);
        System.out.println(h);
    }
}
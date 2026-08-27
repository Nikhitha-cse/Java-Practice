import java.util.*;
public class Large{
    public static void main(String[] args){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(25);
        l.add(10);
        l.add(45);
        l.add(30);
        l.add(15);
        int large =l.get(0);
        int small=l.get(0);
        for(int i=0;i<l.size();i++){
            if(l.get(i) > large){
                large=l.get(i);
            }else if(l.get(i) < small){
                small=l.get(i);
            }
        }
        System.out.println(l);
        System.out.println("Large: " + large);
        System.out.println("Smallest: " + small);
    }
}
import java.util.*;
public class Add{
    public static void main(String[] args){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        int sum=0;
        for(int i=0;i<l.size();i++){
            sum=sum+l.get(i);
        }
        System.out.println(l);
        System.out.println(sum);
    }
}
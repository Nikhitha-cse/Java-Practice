import java.util.*;
public class Reverse{
    public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<>();
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50);

ArrayList<Integer> rev=new ArrayList<>();
for(int i=al.size()-1;i>=0;i--){
    int num=al.get(i);
    rev.add(num);
}
System.out.println(rev);
    }
}
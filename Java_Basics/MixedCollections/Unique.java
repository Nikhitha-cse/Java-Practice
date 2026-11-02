import java.util.*;
public class Unique{
    public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<>();
al.add(10);
al.add(20);
al.add(10);
al.add(30);
al.add(20);
al.add(40);
al.add(30);

ArrayList<Integer> u=new ArrayList<>();
for(int i=0;i<al.size();i++){
     int num=al.get(i);
     if(!u.contains(num)){
          u.add(num);
     }
}
System.out.println("Unique: " + u);
    }
}
import java.util.*;
public class Largest{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(25);
        al.add(10);
        al.add(45);
        al.add(5);
        al.add(30);
        int largest=al.get(0);
        int smallest=al.get(0);
        for(int i=0;i<al.size();i++){
            if(al.get(i) > largest){
                largest=al.get(i);
            } else{
                smallest=al.get(i);
            }
        }
        System.out.println(al);
        System.out.println("Large: " + largest);
        System.out.println("Small: " + smallest);
    }
}
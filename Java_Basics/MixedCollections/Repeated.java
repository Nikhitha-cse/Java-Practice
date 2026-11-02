import java.util.*;
public class Repeated{
    public static void main(String[] args){
       ArrayList<Integer> al=new ArrayList<>(); 
       al.add(10);
       al.add(20);
       al.add(30);
       al.add(20);
       al.add(40);
       al.add(10);

    ArrayList<Integer> repeat=new ArrayList<>(); 
    boolean found=false;
       for(int i=0;i<al.size();i++){
        int num1=al.get(i);
        for(int j=i+1;j<al.size();j++){
            int num2=al.get(j);
            if(num1==num2){
            repeat.add(num1);
            found=true;
            break;
            }
        }
        if(found){
                break;
            }
        System.out.print(repeat);
       }
       System.out.println(repeat);

    }
}
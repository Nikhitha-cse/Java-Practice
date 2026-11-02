import java.util.*;
public class Common{
    public static void main(String[] args){
       ArrayList<Integer> list1=new ArrayList<>(); 
       ArrayList<Integer> list2=new ArrayList<>(); 

       list1.add(10);
       list1.add(20);
       list1.add(30);
       list1.add(40);
       list2.add(20);
       list2.add(40);
       list2.add(50);
       list2.add(60);
    
    ArrayList<Integer> cmn=new ArrayList<>(); 
       for(int i=0;i<list1.size();i++){
       int num=list1.get(i);
       if(list2.contains(num)){
         cmn.add(num);
       }    
        }
        System.out.println(cmn);
    }
}
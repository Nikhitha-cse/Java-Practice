import java.util.*;
public class hm8{
    public static void main(String[] args){
        Map<String ,Integer> m=new HashMap<>();
        m.put("Apple",50);
        m.put("Banana",30);
        m.put("Mango",70);
        m.put("Orange",40);
        //int count=0;
        //for(int x:m.values()){
          //  if(x == 5){
            //    count++;} } System.out.println(count);
        int largest=0;
        int smallest=Integer.MAX_VALUE;
        for(int x:m.values()){
            if(x > largest){
                largest=x;
            } else if(x<smallest){
              smallest=x;
            }
        }
        System.out.println("LArge:"+largest);
        System.out.println("Small: " + smallest);



    }
}
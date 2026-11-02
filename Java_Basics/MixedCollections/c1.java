import java.util.*;
public class c1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int list[]=new int[6];
        for(int i=0;i<list.length;i++){
            list[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<list.length;i++){
            if(h.containsKey(list[i])){
        h.put(list[i],h.get(list[i]) + 1);
        }else{
            h.put(list[i],1);
        }  
            }
            System.out.print(h);
    }
}
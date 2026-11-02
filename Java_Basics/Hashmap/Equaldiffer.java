import java.util.*;
public class Equaldiffer{
    public static void main(String[] args){
        int[] a={1,5,3,4,2};
        int differ=2;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            int num=a[i];
            int c=num-differ;
            int b=num+differ;
            if(set.contains(c)){
                System.out.println("(" + num + ", " + c + ")");
            }if(set.contains(b)){
                System.out.println("(" + num + ", " + b + ")");
            } 
            set.add(num);  
        }
    }
}
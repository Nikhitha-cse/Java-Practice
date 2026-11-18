import java.util.*;
public class Negative {
    public static void main(String[] args) {
        int[] a={12,-1,-7,8,-15,30,16,28};
        int k=3;
        int[] res=new int[a.length-k+1];
        List<Integer> index=new ArrayList<>();
        for(int i=0;i<k;i++) {
            if(a[i]<0) {
                index.add(i);
            }
        }
        if(index.isEmpty()) {
            res[0]=0;
        } else{
            res[0]=a[index.get(0)];
        }
        
         for(int i=k;i<a.length;i++) {
          if(!index.isEmpty() && index.get(0)==i-k){
            index.remove(0);
          }
          
            if(a[i]<0) {
                index.add(i);
            }
        
        if(index.isEmpty()){
            res[i-k+1]=0;
        } else{
            res[i-k+1]=a[index.get(0)];
        }
         }
        System.out.println(Arrays.toString(res));
    }
}
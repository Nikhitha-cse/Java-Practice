import java.util.*;
public class Pivot{
    public static void main(String[] args) {
        int[] a={1,7,3,6,5,6};
        int Tsum=0;
       for(int i=0;i<a.length;i++) {
            Tsum=Tsum+a[i];
        }
         int lsum=0;
         int pivot=-1;
         for(int i=0;i<a.length;i++){
            int rsum=Tsum-lsum-a[i];
            if(lsum==rsum){
                pivot=i;
                break;
            } 
            else{
                lsum=lsum+a[i];
            }
         }
         System.out.println(pivot);
    }
}
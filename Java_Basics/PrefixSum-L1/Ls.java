import java.util.*;
public class Ls{
    public static void main(String[] args){
        int[] a={4,2,7,1,3};
        int Tsum=0;
       for(int i=0;i<a.length;i++) {
            Tsum=Tsum+a[i];
        }
         int lsum=0;
         for(int i=0;i<a.length;i++){
            int rsum=Tsum-lsum-a[i];
            System.out.println("Index: " + i + " Leftsum: " + lsum + " Rightsum: " + rsum);
            lsum=lsum + a[i];
         }

    }
}
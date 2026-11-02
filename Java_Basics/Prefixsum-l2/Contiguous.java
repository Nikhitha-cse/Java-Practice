import java.util.*;
public class Contiguous {
    public static void main (String[] args) {
        int[] a={0,1,0,1,1,0};
        int max=0;
        for(int i=0;i<a.length;i++) {
        int zs=0;
        int os=0;
        for(int j=i;j<a.length;j++) {
            if(a[j]==0){
                zs++;
            }
            else {
                os++;
            }
         if(zs==os){
            int length=j-i+1;
            max=Integer.max(length,max);
        }
        }
        }
    System.out.println(max);;
        
}
}
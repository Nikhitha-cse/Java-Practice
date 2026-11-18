import java.util.*;
public class Average {
    public static void main(String[] args) {
        int[] a={1,3,2,6,-1,4,1,8,2};
        int k=5;
        double[] res=new double[a.length-k+1];
        double sum=0;
        for(int i=0;i<k;i++) {
            sum += a[i];
        } 
        double avg=sum/k;
        res[0]=avg;

        int j=1;
        for(int i=k;i<a.length;i++){
            sum=sum-a[i-k] +a[i];
        
        avg=sum/k;
        res[j]=avg;
        j++;
        }
     System.out.println(Arrays.toString(res));
        
    }
    
}
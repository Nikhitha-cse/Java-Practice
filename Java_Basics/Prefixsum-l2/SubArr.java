import java.util.*;
public class SubArr{
    public static void main(String[] args){
        int[] a={23,2,4,6,7};
        int k=6;
        boolean res=false;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum=sum+a[j];
                 int num=j-i+1;

                if(sum%k==0 && num >=2){
                 res=true;
                }
            }
            if(res){
                break;
            }
        }
        System.out.println(res);
    }
}
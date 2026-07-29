import java.util.*;
public class Repeating{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int found=-1;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                   found=arr[i]; 
                   break;
                } 
            }
            if(found!= -1){
                break;
            }
        }
        System.out.println("Repeated num:" + found);
        }
        }
    

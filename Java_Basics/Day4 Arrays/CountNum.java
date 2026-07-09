import java.util.*;
public class CountNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size: ");
        int n=sc.nextInt();
        System.out.println("Enter nums:");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                even++;
            } else{
                 odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
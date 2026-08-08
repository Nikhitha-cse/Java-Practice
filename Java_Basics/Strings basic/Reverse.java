import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        System.out.println("Reverse: ");
        for(int i=len-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        
    }
}
import java.util.Scanner;
public class Eachchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        for(int i=0;i<s.length();i++){
         char  c=s.charAt(i);
        
        System.out.println("Char " + (i+1) + " is: " + c);
        }
        System.out.println("Name : " + s);
        System.out.println("Length : " + len);
        
    }
}
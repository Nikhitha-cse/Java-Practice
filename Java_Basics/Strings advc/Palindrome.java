import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean palindrome=true;
        for(int i=0;i<s.length()/2;i++){
            char ch=s.charAt(i);
            if(ch  != s.charAt(s.length()-1-i)){
              palindrome=false;
              break;
            }
        }
            System.out.print(palindrome);
        }
}
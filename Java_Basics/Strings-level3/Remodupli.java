import java.util.*;
public class Remodupli{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(res.indexOf(ch)==-1){
                res+=ch;
            }
        }
        System.out.println(res);
        String dupli="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        if(s.indexOf(ch) != s.lastIndexOf(ch) && dupli.indexOf(ch) == -1){
            dupli=dupli+ch;
        }
        }
        System.out.println("Duplicates are: " + dupli);
    }
}
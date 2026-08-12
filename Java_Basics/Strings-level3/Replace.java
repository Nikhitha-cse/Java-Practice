import java.util.*;
public class Replace{
    public static void main(String[] arsg){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the word: ");
    String s=sc.nextLine();
    System.out.println("Enter character to replace: ");
    char c1=sc.next().charAt(0);
    System.out.println("Enter new character: ");
    char c2=sc.next().charAt(0);
    String res="";
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch==c1){
        res=res+c2;
        }else{
            res=res+ch;
        }
    }
    System.out.println("Replaced word: " + res);
    }
}
import java.util.*;
public class Wordrev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            String cword=words[i];
    
           for(int j=cword.length()-1;j>=0;j--){
             char ch=cword.charAt(j);
             System.out.print(ch);
             }
             System.out.print(" ");
        }
    }
}
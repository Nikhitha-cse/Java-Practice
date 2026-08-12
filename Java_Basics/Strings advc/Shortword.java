import java.util.*;
public class Shortword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] word=s.split(" ");
        String min = word[0];
        for(int i=1;i<word.length;i++){
            String cword=word[i];
            if(cword.length() < min.length()){
                min=cword;
            }
        }
        System.out.println("Shortest word: " + min);
    }
}
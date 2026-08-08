import java.util.*;
public class Words{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int words=1;
        for(int i=0;i<s.length()-1;i++){
        char ch=s.charAt(i);
        if(ch==' ' && s.charAt(i+1) !=' '){
            words++;
        }
        }
        System.out.println("Words : " + words);
    }
}
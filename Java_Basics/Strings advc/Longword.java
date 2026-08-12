import java.util.*;
public class Longword{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String longest=" ";
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            String curword=words[i];
            if(curword.length() > longest.length()){
                longest=curword;
            }
        }
        System.out.println("Longest word is: " + longest);

    }
}
import java.util.*;
public class Countword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        String countedwords=" ";
        int count=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.length() > 5){
                count++;
                countedwords=countedwords + " " + word;
            }
        }
        System.out.println(count);
        System.out.println("Words: " + countedwords);
 }
}
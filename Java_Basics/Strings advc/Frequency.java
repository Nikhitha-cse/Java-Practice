import java.util.*;
public class Frequency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count=0;
            if(s.indexOf(ch)!= i){
             continue;
            }else{
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(ch==c){
                    count++;
                }
            }
        }
            System.out.println(ch + " -> " + count);
        }
    }
}
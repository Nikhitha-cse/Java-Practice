import java.util.*;
public class Mostfreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char maxchar=' ';
        int maxcount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count = 0 ;

            for(int j=0;j<s.length();j++){
             if(ch==s.charAt(j)){
              count++;  
             }
        }
        
        if(count > maxcount) {
            maxcount=count;
            maxchar=ch;
        }
        }
        System.out.println("Most frequent character is : " + maxchar);
    }
}
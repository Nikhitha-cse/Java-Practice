import java.util.*;
public class Leastfreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char minchar=' ';
        int mincount=s.length()+1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count = 0 ;
            for(int j=0;j<s.length();j++){
                if(ch == s.charAt(j))
                count++;
            }
            if(count < mincount){
                mincount=count;
                minchar=ch;
            }
        }
        System.out.println("Least character: " + minchar);
    }
}
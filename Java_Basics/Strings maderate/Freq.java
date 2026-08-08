import java.util.*;
public class Freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(ch==c){
                count++;
            }
        }
        System.out.println("Frequency : " + count);
    }
    }

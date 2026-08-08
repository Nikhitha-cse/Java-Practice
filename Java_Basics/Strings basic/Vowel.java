import java.util.*;
public class Vowel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vowel=0;
        int conso=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        vowel++;
        } else{
            conso++;
        }
        }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonents: " + conso);
    }
}
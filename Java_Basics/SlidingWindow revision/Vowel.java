import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        String s="abciiidef";
        int k=3;
        int maxcount=0;
        int count=0;
        for(int i=0;i<k;i++) {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
                count++;
                maxcount=Math.max(maxcount,count);
            }
        }
        for(int i=k;i<s.length();i++) {
            char out=s.charAt(i-k);
            if(out=='a' || out=='e' ||out=='i' ||out=='o' ||out=='u') {
                count--;
            }
            char in=s.charAt(i);
            if(in=='a' || in=='e' ||in=='i' ||in=='o' ||in=='u') {
                count++;
            }
            maxcount=Math.max(maxcount,count);
        }
        System.out.println(maxcount);

    }
}
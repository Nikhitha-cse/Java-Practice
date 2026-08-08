import java.util.*;
public class Count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        int res=words.length;
        System.out.println("Words: " + res);
    }
}
import java.util.*;
public class Secondlarge{
    public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<>();
al.add(10);
al.add(25);
al.add(8);
al.add(40);
al.add(15);
int large=al.get(0);
int seclarge=large;
for(int i=1;i<al.size();i++){
    int num=al.get(i);
if(num > large){
    seclarge=large;
    large = num;
 } else if(num < large && num > seclarge){
       seclarge=num;
    }
}
System.out.println("Sec large: " + seclarge);
    }
}
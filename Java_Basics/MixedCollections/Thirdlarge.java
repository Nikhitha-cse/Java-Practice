import java.util.*;
public class Thirdlarge{
    public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<>();
al.add(10);
al.add(25);
al.add(8);
al.add(40);
al.add(15);
al.add(30);
int large=al.get(0);
int second=large;
int third=second;
for(int i=1;i<al.size();i++){
    int num=al.get(i);
    if(num > large){
        third=second;
        second=large;
        large=num;
    } else if(num > second ){
        third=second;
        second=num;
    }else if(num>third){
          third=num;
    }
}
System.out.println("Third large: " + third);
 }
    }
import java.util.*;
public class Frequency{
    public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<>();
al.add(10);
al.add(20);
al.add(10);
al.add(30);
al.add(20);
al.add(10);

ArrayList<Integer> visited=new ArrayList<>();
for(int i=0;i<al.size();i++){
 int num=al.get(i);
if(visited.contains(num)){
    continue;
}
int count=0;
for(int j=0;j<al.size();j++){
    int current=al.get(j);
    if(num == current){
        count++;
    }
 }
System.out.println(num + "->" + count);
visited.add(num);
}
    }
}
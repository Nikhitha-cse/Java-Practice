public class Stud{
    String name;
    int age;
Stud(String name, int age){
    this.name=name;
    this.age=age;
}
public void display() {
    System.out.println(name + age);
    }
public void showName(String name){
System.out.println("Name: " + name);
}
public int add(int a, int b){
    int result=a + b;
    return result;
}
public int add(int a,int b,int c){
    int result=a+b+c;
    return result;
}
    public static void main(String[] args) {
        Stud s1=new Stud("nikki", 22);
        Stud s2=new Stud("vaishu", 24);
        s1.display();
        s2.display();
        s1.showName("navya");

       int result1 =s1.add(10,20);
       int result2=s2.add(1,2,3);
       System.out.println(result1);
       System.out.println(result2);

    }
}
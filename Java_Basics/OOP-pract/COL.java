public class COL {
    String name;
    int age;
COL(String name){
    this.name=name;
} 
public void showName(){
    System.out.println("Name: " + name);
}
COL(String name,int age){
    this.name=name;
    this.age=age;
}
public void showDetails(){
    System.out.println(name + age);
}
public static void main(String[] args) {
    COL c1=new COL("Chintu");
    COL c2=new COL("madhu", 45);
    c1.showName();
    c2.showDetails();
}

}
public class Vehicles{
    String brand ;
Vehicles(String brand){
    this.brand=brand;
}
public void showBrand(){
         System.out.println(brand);
}
static class Car extends Vehicles{
String brand;
Car(String brand){
    super("Toyota");
    this.brand=brand;
}
void show(){
    System.out.println(this.brand);
    System.out.println(super.brand);
}
}
public static void main(String[] args){
    Car c=new Car("BMW");
    c.show();
}
}
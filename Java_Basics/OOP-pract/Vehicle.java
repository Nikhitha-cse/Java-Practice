public class Vehicle {
    String brand;
    void start() {
        System.out.println("Vehicle is starting");
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.drive();
    }

}
class Car extends Vehicle {
    void drive(){
        System.out.println("Car is drivind");
    }
}
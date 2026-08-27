public class car{
    String brand;
    double price;
    public void display(){
    System.out.println("Brand:" + brand);
    System.out.println("Price : " + price);
   }
   public car(String brand, double price) {
      this.brand=brand;
      this.price=price;
   }
   public car(String brand){
    this.brand=brand;
    this.price=1000000;

   }
    public static void main(String[] args) {
     car c1=new car("Toyota" , 800000);
     car c2=new car("Suzuki" , 1000000);
     car c3=new car("BMW");
     c1.display();
     c2.display();
     c3.display();
    }
}


    
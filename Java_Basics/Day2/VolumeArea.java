import java.util.*;
public class VolumeArea{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a length: ");
      double l=sc.nextDouble();
      System.out.println("Enter a breadth");
      double b=sc.nextDouble();
      System.out.println("Enter a height");
      double h=sc.nextDouble();
      double volume=l * b * h;
      double surfaceArea = 2*(l*b + b*h + l*h);
      System.out.println("Volume: " + volume + "Surface Area: " + surfaceArea);

    }
}
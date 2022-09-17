import java.util.*;
public class araeofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of circle:");
        double radiusofcircle = sc.nextDouble(); 
        System.out.println("area of circle is: "+area(radiusofcircle));
    }
    public static double area(Double radius){
          return Math.PI*radius*radius;
    }
}

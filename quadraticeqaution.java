import java.util.*;
public class quadraticeqaution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = Math.pow(b, 2) - (4*a*c);
        if(d>0){
              System.out.println("Two Roots are real");
              System.out.println("roots are "+((-b-Math.sqrt(d))/2*a)+" and "+((-b+Math.sqrt(d))/2*a));
        }
        else if(d==0){
             System.out.println("two roots are euqal");
             System.out.println("roots are "+(-b/2*a));
        }else{
            System.out.println("roots are not real");
            System.out.println("roots are "+((-b-Math.sqrt(d))/2*a)+" and "+((-b+Math.sqrt(d))/2*a));
        }

    }
}
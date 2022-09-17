import java.util.*;
public class lcmrec {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the numbers");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("LCM is "+lcm(a, b));
    }
    public static int lcm(int num1,int num2){
        return (num1/gcd(num1,num2))*num2;
    }
    public static int gcd(int a,int b){
       if(a==0){
            return b;
       }else{
            return gcd(b%a,a);
       }
    }
}

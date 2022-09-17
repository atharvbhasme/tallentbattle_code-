import java.util.*;
public class fraction{
    public static void main(String args[]){
         Scanner sc  = new Scanner(System.in);
         System.out.println("enter the number1 fraction ");
         int x1 = sc.nextInt();
         int x2 = sc.nextInt();
         System.out.println("enter the numebr2 fraction ");
         int y1 = sc.nextInt();
         int y2 = sc.nextInt();
         int ans1 = x1*y2+x2*y1;
         int ans2 = x2*y2;
         System.out.println("the answer is "+ ans1 + "/"+ ans2);
    }
}
//double the number without using arithmetic oprator
import java.util.*;
public class doublenumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int db = num<<1;
        System.out.println("doubled number is: "+db);
    }
}

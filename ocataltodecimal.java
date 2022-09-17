import java.util.*;
public class ocataltodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ocatal number");
        int num = sc.nextInt();
        int n = 0;
        int decimal = 0;
        while (num>0) {
            int digit = num%10;
            decimal += digit * Math.pow(8, n);
            num = num/10;
            n++;
        }
        System.out.println("the decimal number is "+ decimal);
    }
}

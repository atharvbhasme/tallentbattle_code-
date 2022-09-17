import java.util.*;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binarynum = sc.nextInt();
        int decimal = 0;
        int n=0;
        while (binarynum>0) {
            int digit = binarynum%10;
            if(digit==1){
                decimal += Math.pow(2, n);
            }
            n++;
            binarynum = binarynum/10;
        }
        System.out.println("Decimal number is "+ decimal);
    }
}

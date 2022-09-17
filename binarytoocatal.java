import java.util.*;
public class binarytoocatal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int num = sc.nextInt();
        int decimal = 0;
        int n = 0;
        while (num>0) {
            int digit = num%10;
            decimal += digit*Math.pow(2, n);
            n++;
            num = num/10;
        } 
        System.out.println("the decimal number is "+decimal);

        int[] octal = new int[20];
        int i=0;
        while (decimal>0) {
            int rem = decimal%8;
            octal[i++] = rem;
            decimal = decimal/8;
        }
        System.out.print("the ocatal number is ");
        for (int j = i-1; j >=0; j--) {
            System.out.print(octal[j]);
        }
        sc.close();
    }
}

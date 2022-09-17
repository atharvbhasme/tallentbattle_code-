import java.util.*;
public class replaceonewithzerousingstring{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        String num = Integer.toString(number);
        int len = num.length();
        String copy = "";
        for (int i = 0; i < len; i++) {
            if(num.charAt(i)=='0'){
                 copy = copy + '1';
            }else{
                 copy = copy + num.charAt(i);
            }
        }
        System.out.println("converted number is "+copy);
        sc.close();
    }
}
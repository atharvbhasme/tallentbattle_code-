import java.util.*;
public class primenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int flag = 0;
        if(num<=1){
              System.out.println(num+"is not prime number");
        }else{
             for (int i = 2; i <= num/2; i++) {
                if(num%i==0){
                    flag++;
                    break;
                }
             }
        }
        if(flag==0){
           System.out.println(num+" is prime number");
        }else{
           System.out.println(num+" is not prime number");
        }
    }
}
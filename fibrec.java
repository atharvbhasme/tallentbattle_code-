import java.util.*;
public class fibrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

    }
    public static int fib(int num){
         if(num<=1){
              return num;
         }else{
            return fib(num-1)+fib(num-2);
         }
    }
}

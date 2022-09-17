import java.util.*;
public class fibdynamic{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
              System.out.print(fib(i)+" ");
        }
    }
    public static int fib(int num){
         int f[] = new int[num+2];
         int i;
         f[0] = 0;
         f[1] = 1;
         for(i=2;i<=num;i++){
              f[i] = f[i-1]+f[i-2];
          }
          return f[num];
    }
}
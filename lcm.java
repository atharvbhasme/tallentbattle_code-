import java.util.*;
public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int lcm=1;
        int max = (num1 > num2)? num1:num2;
        for(int i = max ; i <= num1*num2 ; i++)
            {
                if(i%num1==0 && i%num2==0){
                    lcm = i;
                    break;
                }
            }    
        System.out.println (lcm);
    }
}

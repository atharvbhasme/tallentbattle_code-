//print the ASCII value of charcter
import java.util.*;;
public class ascii {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the charcter");
        char ch = sc.next().charAt(0);
        int a = ch;
        System.out.println("ascii value of charcter is: "+ a);
    }
}

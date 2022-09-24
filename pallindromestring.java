import java.util.*;
public class pallindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        char ch;
        for (int i = str.length()-1; i>=0; i--) {
            ch = str.charAt(i);
            rev = rev + ch;
        }
        // System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }
    }
}

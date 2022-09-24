import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.nextLine();
        System.out.println(rev(str));
    }
    public static String rev(String str){
        char ch;
        String ans = "";
        for (int i = str.length()-1; i >= 0; i--) {
            ch = str.charAt(i);
            ans = ans + ch;
        }
        return ans;
    }
}

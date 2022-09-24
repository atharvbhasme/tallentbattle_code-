import java.util.*;
public class replacechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = str.replaceAll("[^A-Za-z]", "");
        System.out.println(ans);
    }
}

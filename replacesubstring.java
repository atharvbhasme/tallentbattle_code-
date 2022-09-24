import java.util.*;
public class replacesubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String original = sc.nextLine();
        System.out.println("Enter the string you want to remove");
        String remove = sc.nextLine();
        System.out.println("Enter the string you want to add");
        String add = sc.nextLine();
        System.out.println(rearrange(original, remove, add));

    }
    public static String rearrange(String original, String remove, String add ){
        String ans = original.replace(remove, add);
        return ans;
    }
}

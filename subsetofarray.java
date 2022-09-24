import java.util.*;
public class subsetofarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0,i,j;
        int[] arr1 = {10,45,23,45,67,34,23};
        int[] arr2 = {23,45};
        for ( i = 0; i < arr2.length; i++) {
            for ( j = 0; j < arr1.length; j++) {
                if (arr2[i]==arr1[j]) {
                    break;
                }
            }
            if (j==arr1.length) {
                ans=1;
            }
        }
        if (ans==1) {
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
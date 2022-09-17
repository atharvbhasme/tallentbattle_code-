import java.util.*;
public class longestpallindromeinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int largestpallindrome = arr[0];
        int pallinarr[];
        int n = 0 ;
        for (int i = 0; i < arr.length; i++) {
            int reverse = 0;
            while(arr[i]>0){
              int digit = arr[i]%10;
              reverse = (reverse*10)+digit;
              arr[i] = arr[i]/10;
            }
            if (reverse==arr[i]) {
                pallinarr[n] = arr[i];
                n++;
            }
        }
    }
}

import java.util.*;
public class oddeveninarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("there are "+odd+" odd and "+even+" elements");
    }
}

public class maximumscalerproduct {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6, 3, 7};
        int[] arr2 = {10, 7, 45, 3, 7};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if (arr1[i]<arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if (arr2[i]<arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        int product = 0;
        for (int i = 0; i < arr1.length; i++) {
            product += arr1[i]*arr2[i];
        }
        System.out.println(product);
    }
}

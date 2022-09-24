public class equlibriumindex {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3};
        int i,j,leftsum,rightsum;
        for(i=0;i<arr.length;i++){
            leftsum = 0;
            for(j=0;j<i;j++){
                leftsum += arr[j];
            }
            rightsum = 0;
            for(j=i+1;j<arr.length;j++){
                rightsum += arr[j];
            }
            if (rightsum==leftsum) {
                break;
            }
        }
        System.out.println(i);
    }
}

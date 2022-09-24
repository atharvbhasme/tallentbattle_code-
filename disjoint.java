public class disjoint {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {6,7,8,1};
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag==false){
            System.out.println("disjoint");
        }else{
            System.out.println("not disjoint");
        }
    }
}

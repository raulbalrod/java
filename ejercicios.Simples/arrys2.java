public class arrys2 {
    public static void main(String[] args) {
        
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = {10,20,30,40,50,60};
        int[] total = new int [16];
        
        for(int i = 0 ;  i < nums1.length; i++){
            total[i] = nums1[i];
        }
        for(int j = 0 ; j < nums2.length; j++){
            total[j + nums1.length] = nums2[j];
        }

        for(int k = 0; k < total.length; k++){
            System.out.print(total[k]);
        }
    }
}

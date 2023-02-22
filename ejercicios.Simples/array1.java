public class array1 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = {10,20,30,40,50,60,70,80,90,100};
        int[] total = new int [nums1.length + nums2.length];

        for(int i = 0; i <nums1.length; i++){
            total[i*2] = nums1[i];
            total[(i*2)+1] = nums2[i];
        }

        for(int j = 0; j < total.length; j++){
            System.out.print(total[j] + " - ");
        }

    }
}

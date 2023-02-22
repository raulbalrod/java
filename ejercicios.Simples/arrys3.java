public class arrys3 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = {10,20,30,40,50,60,70,80,90,100};
        int[] total = new int[nums1.length + nums2.length];

        final int N = 3;
        for(int i = 0; i < nums1.length; i+=N){
            for(int j= 0; j<N; j++){
                total[i*2+j] = nums1[i+j];
                total[i*2+N+j] = nums2[i+j];
            }
        }
        for(int i=0; i <total.length; i++){
            System.out.print(total[i] + " - ");
        }
    }
}

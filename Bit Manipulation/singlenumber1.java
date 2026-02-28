public class singlenumber1 {
    public static void main(String[] args) {
        int [] arr={1,2,2,4,3,1,4};
        System.out.println(singleNumber(arr));
        
    }
     public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans=ans^i;
        }

        return ans;
        
    }
}

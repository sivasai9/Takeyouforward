public class MaxConsecutiveOnesII {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0};
        System.out.println(findMaxConsecutiveOnes(arr));

        
    }
     public static int findMaxConsecutiveOnes(int[] nums) {
        // Your code goes here
        int l=0;
        int r=0;
        int ans=0;
        int zerocount=0;

        while(r<nums.length){
            if(nums[r]==0){
                zerocount++;
            }

            while(zerocount>1){
                if(nums[l]==0){
                    zerocount--;
                }
                l++;
            }

            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;


        
    }
    
}

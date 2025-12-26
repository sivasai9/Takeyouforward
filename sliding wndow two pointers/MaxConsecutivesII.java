public class MaxConsecutivesII {
    public static void main(String[] args) {
        int ans[]={0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        int k=3;
        System.out.println(longestOnes(ans, k));
        
    }

     public static int longestOnes(int[] nums, int k) {
        //your code goes here
        int l=0;
        int r=0;
        int ans=0;
        int zerocon=0;

        while(r<nums.length){ 
            if(nums[r]==0){
                zerocon++;
            }

            while(zerocon>k){

                if(nums[l]==0){
                    zerocon--;
                }


                l++;
            }

            ans=Math.max(ans,r-l+1);
            r++;

        }
        return ans;
         
    }
    
}
 
public class jump1 {
    public static void main(String[] args) {
        int [] nums={2,3,1,1,4};
        System.out.println(canJump(nums));
        
    }
    public static boolean canJump(int[] nums) {
        //your code goes here
        int maxindex=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxindex){
                return false;
            }
            maxindex=Math.max(maxindex,i+nums[i]);
        }
        return true;
    }
    
}

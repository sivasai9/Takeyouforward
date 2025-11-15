public class CountallsubsequenceswithsumK {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4};
        int target = 5;
        System.out.println(countSubsequenceWithTargetSum(nums1, target));
    }

    public static int countSubsequenceWithTargetSum(int[] nums, int k) {

        return solve(0,nums,k);

    }

    public static int solve(int i,int[] nums,int tar){

        if(tar==0) return 1;

        if(tar<0 || i==nums.length){
            return 0;
        }
        int path1=solve(i+1, nums, tar-nums[i]);
        int path2=solve(i+1, nums, tar);

        return path1+path2;
    }
    
}

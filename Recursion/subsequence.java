public class subsequence {
    public static void main(String[] args) {
    
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        System.out.println(checkSubsequenceSum(nums, target)); 
        
    }
       public static boolean checkSubsequenceSum(int[] nums, int k) {
         //your code goes here4
         int n=nums.length;
         return solve(0,n,nums,k);

    }
    public static boolean solve(int index,int n,int[] arr,int sum){
        if(sum==0){
            return true;
        }
        if(sum<0){
            return false;
        }
        if(index==n){
            return sum==0;
        }

        boolean path1=solve(index+1,n,arr,sum-arr[index]);
        boolean path2=solve(index+1,n,arr,sum);

        return path1 || path2;

    }
}

public class MaxConsecutiveOnesiIIbruteforce {
    public static void main(String[] args) {
        int arr[]={1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k=3;
        System.out.println(longestOnes(arr, k));

        
    }
     public static int longestOnes(int[] nums, int k) {
        //your code goes here
        int n=nums.length;
        int max_len=0;

        for(int i=0;i<n;i++){
            int len=0;
            int count0=0;
            for(int j=i;j<n;j++){

                if(nums[j]==0 && count0<k){
                    count0++;
                    len++;
                }else if (nums[j]==1){
                    len++;
                }
                else{
                    break;
                }
                max_len=Math.max(len,max_len);
            }
        }
        return max_len;

    }
    
}

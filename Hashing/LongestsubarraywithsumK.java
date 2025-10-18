import java.util.*;

public class LongestsubarraywithsumK {
    public static void main(String[] args) {
        int [] arr={10,5,2,7,1,9};
        System.out.println(longestSubarray(arr,15));
        
    }
    public static int longestSubarray(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int max_len=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            if(sum==k){
                max_len=Math.max(max_len, i+1);
            }
            int rem=sum-k;

            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                max_len=Math.max(max_len, len);
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return max_len;

       
    }
    
}

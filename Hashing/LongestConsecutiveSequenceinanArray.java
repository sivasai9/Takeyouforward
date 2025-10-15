import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceinanArray {
    public static void main(String[] args) {
        int nums[] = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
        
    }
     public static int longestConsecutive(int[] nums) {
        
        int n=nums.length;
        int longest=1;
        Set<Integer> st=new HashSet<>();

        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }

        for(int i:st){
            if(!st.contains(i-1)){
                int count=1;
                int x=i;

                while (st.contains(x+1)) {
                    count++;
                    x=x+1;

                }
                longest=Math.max(count, longest);
            }

        }
        return longest;
        
        
    }
    
}

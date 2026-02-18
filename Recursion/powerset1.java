import java.util.ArrayList;
import java.util.List;

public class powerset1 {
    public static void main(String[] args) {

        int nums[]={1, 2, 3};
        System.out.println(powerSet(nums));

        
    }
     public static List<List<Integer>> powerSet(int[] nums) {
        //your code goes here

        List<List<Integer>> ans=new ArrayList<>();

        List<Integer> curr=new ArrayList<>();

        backtrack(0,nums.length,nums,ans,curr);

        return ans;
    }

    public static void backtrack(int ind, int n,int[] nums,List<List<Integer>> ans,List<Integer> curr){


        if(ind==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[ind]);
        backtrack(ind+1, n, nums, ans, curr);
        curr.remove(curr.size()-1);

        backtrack(ind+1, n, nums, ans, curr);

    }
    
}

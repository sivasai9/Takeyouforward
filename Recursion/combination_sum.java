import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
        
    }
     public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        //your code goes here
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        
        for(int num:candidates){
            ls.add(num);
        }

        fun(ls,ls.size()-1,target,new ArrayList<>(),ans);

        return ans;
    }

    public static void fun(List<Integer> ls,int i,int sum,List<Integer> v2,List<List<Integer>> ans){
        if(sum==0){
            ans.add(new ArrayList<>(v2));
            return;
        }

        if(sum<0||i<0){
            return;
        }
        fun(ls,i-1,sum,v2,ans);
        v2.add(ls.get(i));
        fun(ls,i,sum-ls.get(i),v2,ans);
        v2.remove(v2.size()-1);
    }
    
}

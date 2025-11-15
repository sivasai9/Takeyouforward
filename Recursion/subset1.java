import java.util.ArrayList;
import java.util.List;

public class subset1 {
    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
        
        List<Integer> ls=new ArrayList<>();
        func(0,0,nums,ls);
        return ls;
    }

    public static void func(int ind,int sum,int[] num,List<Integer> ans){
        if(ind==num.length){
            ans.add(sum);
            return;
        }

        func(ind+1,sum+num[ind],num,ans);

        func(ind+1,sum,num,ans);

    }
    
}

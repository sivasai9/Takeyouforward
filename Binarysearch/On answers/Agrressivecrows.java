import java.util.Arrays;

public class Agrressivecrows {
    public static void main(String[] args) {
        int nums []={4,2,1,3,6};
        int k=2;
        System.out.println(aggressiveCows(nums, k));
        
    }
    public static int aggressiveCows(int[] nums, int k) {


         int n=nums.length;

        // Arrays.sort(nums);
        // int max=nums[n-1]-nums[0];
        // for(int i=1;i<=max;i++){
        //     if(canplace(nums,i,k)){
        //         continue;
        //     }
        //     else{
        //         return i-1;
        //     }
        // }
        // return max;

        Arrays.sort(nums);
        int low=1;
        int high=nums[n-1]-nums[0];

        while (low<=high) {
            int mid=(low+high)/2;
            if(canplace(nums, mid, k)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
   
    }

    public static boolean canplace(int [] nums,int dis,int cow){
        int coucows=1;
        int last=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]-last>=dis){
                coucows++;
                last=nums[i];
            }
            if(coucows>=cow)return true;

        }
        return false;
      
    }

    
}

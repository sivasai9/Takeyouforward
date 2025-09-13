public class MinimumdaystoMbouquets {
    public static void main(String[] args) {
        int nums []={7, 7, 7, 7, 13, 11, 12, 7};
        int m=2;
        int k=3;
        System.out.println(roseGarden(nums.length,nums, k, m));
        
    }
    public static boolean possible(int []nums,int day,int k,int m){
        int cout=0;
        int nb=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=day){
                cout++;
            }
            else{
                nb=nb+(cout/k);
                cout=0;
            }
        }
        nb=nb+(cout/k);

        if(nb>=m){
            return true;
        }
        return false;


    }
    public static int roseGarden(int n, int[] nums, int k, int m) {

        int val=m*k;
        if(val>n) return -1;

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min, nums[i]);
            max=Math.max(max,nums[i]);
        }



        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(nums, mid, k, m)){
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        }
        return low;

        // for(int i=min;i<=max;i++){
        //     if(possible(nums,i,k,m)){
        //         return i;
        //     }

        // }
        // return -1;
    }
    
}

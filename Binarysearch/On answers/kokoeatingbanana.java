public class kokoeatingbanana {
    public static void main(String[] args) {
        int [] nums={7,15,6,3};
        int h=8;
        System.out.println(minimumRateToEatBananas(nums, h));
        
    }
    public static long caltime(int []nums,int h){
        long tot=0;
        for(int i=0;i<nums.length;i++){
            tot=tot+(long)Math.ceil((double)nums[i]/(double)h);
        }
        return tot;

    }
    public static int minimumRateToEatBananas(int[] nums, int h) {

        // optimal
    int max=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
    }

    int low=0;
    int high=max;

    while(low<=high){
        int mid=(low+high)/2;
        long time=caltime(nums,mid);
        if(time<=h){
            high=mid-1;
        }
        else{
            low=mid+1;
        }

    }
    return low;


    //  brute force
    //   int max_ele=nums[0];
    //   for(int i=1;i<nums.length;i++){
    //     if(nums[i]>max_ele){
    //       max_ele=nums[i];
    //     }
    //   }

    //   for(int i=1;i<=max_ele;i++){
    //     long reqtime=caltotalhours(nums,i);
    //     if(reqtime<=(long) h){
    //       return i;
    //     }
    //   }
    //   return max_ele;
    // }

    // public static long caltotalhours(int [] nums,int h){
    //   long tot=0;
    //   int n=nums.length;

    //   for(int i=0;i<n;i++){
    //     tot=tot+(long)Math.ceil((double)nums[i]/(double)h);
    //   }
    //   return tot;

    }
    
}

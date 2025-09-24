import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int [] nums={5, 7, 7, 8, 8, 10};
        int tar =8;
        System.out.println(Arrays.toString(searchRange(nums, tar)));
        
    }

    public static int[] searchRange(int[] nums, int target) {

        int [] arr=new int[2];

        arr[0]=firstOcc(nums,target);
        arr[1]=lastocc(nums,target);

        return arr;
        
    }

    public static int lastocc(int[] nums,int tar){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while (low<=high) {
            int mid=(low+high)/2;

            if(nums[mid]==tar){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]<tar){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }


    public static int firstOcc(int[] nums,int tar){
        int low=0;
        int high=nums.length-1;
        int ans=-1;

        while (low<=high) {
            int mid=(low+high)/2;

            if(nums[mid]==tar){
                ans=mid;
                high=mid-1;

            }
            else if (nums[mid]<tar){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

            
        }
        return ans;
    }
    
}

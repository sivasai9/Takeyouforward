import java.util.HashMap;

public class ofHighestandLowestFrequency {
    public static void main(String[] args) {
        int []arr = {1, 2, 2, 3, 3, 3};
        System.out.println(sumHighestAndLowestFrequency(arr));

        
    }
    public static int sumHighestAndLowestFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int n=nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int max_count=Integer.MIN_VALUE;
        int max_ele=-1;
        int min_ele=-1;
        int min_count=Integer.MAX_VALUE;

        for(Integer key:map.keySet()){
            Integer val=map.get(key);
            if(val>max_count){
                max_count=val;
               max_ele=key;
            }
            if(val<min_count){
                min_count=val;
                min_ele=key;
            }
           
        }

        return max_ele+min_ele;

      
    }
}

import java.util.HashMap;

public class HighestOccurringElementinanArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 3, 3};
        System.out.println(mostFrequentElement(nums));

        
    }
     public static int mostFrequentElement(int[] nums) {
        int ele=0;
        int max_cou=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Integer key:map.keySet()){
            Integer count=map.get(key);
            if(count>max_cou){
                ele=key;
                max_cou=count;
            }
            else if(max_cou==count){
                ele=Math.min(key,ele);
            }
        }
        
        return ele;
    }
    
}

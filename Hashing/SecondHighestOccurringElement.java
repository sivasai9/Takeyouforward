import java.util.HashMap;

public class SecondHighestOccurringElement {
    public static void main(String[] args) {
        
    }
     public static int secondMostFrequentElement(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int ele1=0,ele2=0;
        int ele1_cou=0;
        int ele2_cou=0;

        for(Integer key:map.keySet()){
            Integer count=map.get(key);
            if(count>ele1_cou){
                ele2_cou=ele1_cou;
                ele1_cou=count;
                ele2=ele1;
                ele1=key;
            }
            else if () {
                
            }

            
        }

        

     
    }
    
}

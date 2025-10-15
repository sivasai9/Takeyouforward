import java.util.HashMap;

public class SecondHighestOccurringElement {
    public static void main(String[] args) {
        int []arr={1, 2, 2, 3, 3, 3};
        System.out.println(secondMostFrequentElement(arr));
    }
     public static int secondMostFrequentElement(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int ele1=-1,ele2=-1;
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
            else if (ele1_cou==count) {
                ele1=Math.min(ele1,key);
            }
            else if(count>ele2_cou){
                ele2_cou=count;
                ele2=key;
            }
            else if(count==ele2_cou){
                ele2=Math.min(ele2,key);

            }

            
        }
        return ele2;

        

     
    }
    
}

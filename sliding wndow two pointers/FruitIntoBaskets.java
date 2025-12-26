import java.util.*;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int []arr={1, 2, 3, 2, 2};
        System.out.println(totalFruits(arr));
        

        
    }
    public static int totalFruits(int[] fruits) {

        // brute force algorthim
    //     int maxlen=0;
    //     for(int i=0;i<fruits.length;i++){

    //         Set<Integer> st=new HashSet();

    //         for(int j=1;j<fruits.length;j++){

    //             st.add(fruits[j]);

    //             if(st.size()<=2){
    //                 maxlen=Math.max(maxlen,j-i+1);
    //             }
    //             else{
    //                 break;
    //             }

    //         }
            
    //     }
    //     return maxlen;
    // }

    // OPTIMAL SOLUTION

    int l=0,r=0;
    int maxlen=0;

    HashMap<Integer,Integer> mp=new HashMap<>();

    while (r<fruits.length) {
        mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);

        if(mp.size()>2){
            mp.put(fruits[l],mp.get(fruits[l])-1);

            if(mp.get(fruits[l])==0){
                mp.remove(fruits[l]);
            }
            l++;
        }
        if(mp.size()<=2){
            maxlen=Math.max(maxlen, r-l+1);
        }
        r++;

        
    }
    return maxlen;
}


    
}

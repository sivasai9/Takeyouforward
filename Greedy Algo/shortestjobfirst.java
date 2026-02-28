import java.lang.reflect.Array;
import java.util.Arrays;

public class shortestjobfirst {
    public static void main(String[] args) {
        int [] arr={4,1,3,7,2};
        System.out.println(solve(arr));

        
    }
    public static long solve(int[] bt) {
        //your code goes here
        Arrays.sort(bt);

        long t=0;
        long waitime=0;

        for(int i=0;i<bt.length;++i){
            waitime=waitime+t;
            t=t+bt[i];

        }
        

        return waitime/bt.length;


    }
    
}

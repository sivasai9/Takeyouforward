public class maximum {
    public static void main(String[] args) {
        int[]arr={1, 2, 3, 4, 5, 6};
        int k=3;
        System.out.println(maxScore(arr, k));
        
    }   
    public static int maxScore(int[] cardScore, int k) {
        //your code goes her
        int lsum=0;
        int rsum=0;
        int mxsum=0;

        for(int i=0;i<k;i++){
          lsum=lsum+cardScore[i];
          mxsum=lsum;
        }

        int r=cardScore.length-1;

        for(int i=k-1;i>=0;i--){
          lsum=lsum-cardScore[i];

          rsum=rsum+cardScore[r];
          r--;

          mxsum=Math.max(mxsum,lsum+rsum);
        }

        return mxsum;
    }
    
}

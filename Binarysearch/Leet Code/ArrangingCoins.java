public class ArrangingCoins {
    public static void main(String[] args) {
        
        System.out.println(arrangeCoins(8));
    }
     public static int arrangeCoins(int n) {
       int res=0;

        int low=1;
        int high=n;

        while(low<=high){
            int mid=(low+high)/2;
            int cur=mid*(mid+1)/2;

            if(cur<=n){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
            
        }
        return res;
    }
}

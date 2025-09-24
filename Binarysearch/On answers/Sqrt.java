public class Sqrt{
    public static void main(String[] args) {
        int x=8;
        System.out.println(mySqrt(x));
        
    }
  public static int mySqrt(int x) {

        if(x==0||x==1){
            return x;
        }
        int low=1;
        int high=x/2;

        while(low<=high){
            int mid=(low+high)/2;
            if((long)mid*mid==x){
                return mid;
            }
            else if((long)mid*mid>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high;       
    }

    
    
    
}
    
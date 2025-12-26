public class subarrayoptimal {
    public static void main(String[] args) {
        int arr []={2,5,1,7,10};
        int k=14;
        System.out.println(sub(arr, k));
    }

    public static int sub(int [] arr,int k){

        int l=0;
        int r=0;
        int sum=0;
        int maxlen=0;
        while(r<arr.length){
            sum=sum+arr[r];
            if(sum>k){
                sum=sum-arr[l];
                l++;
            }

            if(sum<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
            
        }
        return maxlen;
    } 
    
}

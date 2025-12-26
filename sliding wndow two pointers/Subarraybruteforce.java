public class Subarraybruteforce {
    public static void main(String[] args) {
        int arr []={2,5,1,7,10};
        int k=14;
        System.out.println(sub(arr, k));
    }

    public static int sub(int [] arr,int k){

        int maxlen=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;

            for(int j=i;j<arr.length;j++){

                sum=sum+arr[j];

                if(sum<=k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
                else if(sum>k){
                    break;
                }
            }
            
        }
        return maxlen; 

    }

}

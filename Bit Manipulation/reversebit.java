public class reversebit {
    public static void main(String[] args) {

        int n=45455464;
        
    }
     public static int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            res=res<<1;
            res=res | (n&1);
            n=n<<1;
        }
      
        return res;
    }
    
}

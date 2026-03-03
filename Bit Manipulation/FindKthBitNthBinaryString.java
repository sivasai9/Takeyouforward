public class FindKthBitNthBinaryString {
    public static void main(String[] args) {
        System.out.println(findKthBit(4, 11));
        
    }
    public static char findKthBit(int n, int k) {
        String ans=series(n);
        System.out.println(ans);

        return ans.charAt(k-1);

             
    }

    public static String series(int n){
        if(n==1){
            return "0";
        }

        String prev=series(n-1);

        return prev+"1"+rev_in(prev);
    }

    public static String rev_in(String m){
       
        StringBuilder sb= new StringBuilder();

        for(char ch:m.toCharArray()){
            sb.append(ch=='0'?'1':'0');

        }
        return sb.reverse().toString();
    

    }
    
}

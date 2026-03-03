public class addbinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
        
    }
     public static String addBinary(String a, String b) {

        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;

        while(i>=0 || j>=0 ||carry==1){
            int sum=carry;
            if(i>=0){
                sum=sum+a.charAt(i)-'0';
                i--;
            }

            if(j>=0){
                sum=sum+b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2); // remainder is the bit
            carry=sum/2; /// for quotuent is carry
        }
        return sb.reverse().toString();
    
    }
    
}

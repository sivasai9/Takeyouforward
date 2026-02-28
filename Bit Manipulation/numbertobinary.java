public class numbertobinary {
    public static void main(String[] args) {
        System.out.println(converttobinary(5));
        
    }
    public static String converttobinary(int n){

        String res="";
        while (n>0){
            if(n%2==1){
                res=res+'1';
            }
            else{
                res=res+'0';
            }
            n=n/2;
        } 

        return new StringBuilder(res).reverse().toString();
        

    }
    
}

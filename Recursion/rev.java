public class rev{
    public static void main(String[] args) {
        System.out.println(addDigits(123));
        
    }

     public static int addDigits(int num) {
        //your code goes here
        if(num==0){
            return 0;
        }
        

        return num%10+ addDigits(num/10);
        
    }
}
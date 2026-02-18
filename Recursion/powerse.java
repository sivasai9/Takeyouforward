public class powerse {
    public static void main(String[] args) {
        double x=2;
        int n=10;
        System.out.println(myPow(x, n));
        
    }
    public static double myPow(double x, int n) {

        long num=n;

        if(num<0){
            

            return (1.0/powe(x,-num));
        }

        return powe(x,num);
        
    }

    public static double powe(double x, long num){
        if(num==0){
             return 1.0;
        }
        if(num%2==0){
            return powe(x*x, num/2);

        }
        return x*powe(x, num-1);
    }
    
}

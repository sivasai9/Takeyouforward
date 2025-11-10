public class powerset{
    public static void main(String[] args) {
        double x=2.000;
        int n=10;
        System.out.println(myPow(x, n));


    }
     public static double myPow(double x, int n) {
        long p=n;
        if(p<0){
            x=1/x;
            p=-1*p;
        }
        double ans=1;
        while(p>0){
            if(p%2!=0){
                ans=ans*x;
                p=p-1;
            }
            else{
                x=(x*x);
                p=p/2;
            }
        }
        return ans;
        
    }
}
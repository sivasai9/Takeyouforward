public class checkithbitsetornot {
    public static void main(String[] args) {
        System.out.println(ithsetbit(13, 2));
        
    }
    public static boolean ithsetbit(int n,int i){
        int m=n>>i;
        System.out.println(m);
        if((m&1)==1){
            return true;
           
        }
        return false;
    }
}

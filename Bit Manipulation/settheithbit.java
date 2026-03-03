public class settheithbit {
    public static void main(String[] args) {
        System.out.println(setithbit(9, 2));
        
    }
    public static int setithbit(int n,int i){
        int m=1<<i;

        return (n|m);

    }
    
}

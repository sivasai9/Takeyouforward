public class clearithbit {
    public static void main(String[] args) {
        System.out.println(clearithbit(9, 2));
    }
    public static int clearithbit(int n,int i){
        return (n^(1<<i));
    }
    
}

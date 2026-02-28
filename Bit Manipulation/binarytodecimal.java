public class binarytodecimal {
    public static void main(String[] args) {
        System.out.println(bintodec("101"));
        
    }
    public static int bintodec(String str){
        int num=0;
        int val=1;
        for(int i=str.length()-1;i>=0;i--){

            if(str.charAt(i)=='1'){
                num=num+val;

            }
            val=val*2;
        }
        return num;
    }
    
}

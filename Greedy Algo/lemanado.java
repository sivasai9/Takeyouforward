public class lemanado {
    public static void main(String[] args) {
        int [] bill={5,5,10,5,20};
        System.out.println(lemonadeChange(bill));
        
    }
       public static boolean lemonadeChange(int[] bills) {

        int five=0;
        int ten=0;

        for(int i:bills){
            if(i==5){
                five++;
            }
            else if(i==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else if (five>=3){
                    five=five-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
    
}

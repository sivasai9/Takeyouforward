public class onescomplaint{
    public static void main(String[] args) {
        String str="0101";
        System.out.println(onesComplaint(str));

        
    }
    public static String onesComplaint(String bin){

        StringBuilder str=new StringBuilder();

        for(int i=0;i<bin.length();i++){

            if(bin.charAt(i)=='0'){
                str.append('1');
            }
            else{
                str.append('0');
            }

        }

        return str.toString();
    }

}
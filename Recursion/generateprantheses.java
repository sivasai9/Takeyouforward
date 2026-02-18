import java.util.*;

public class generateprantheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
        
    }
    public static List<String> generateParenthesis(int n) {
        //your code goes here
        List<String> ls=new ArrayList<String>();
        generate(0,0,"",ls,n);

        return ls;
    }

    public static void generate(int open,int close,String ans,List<String> res,int n){
        // base condition
        if(open==close && open+close==2*n){
            res.add(ans);
        }

        if(open<n){
            generate(open+1, close, ans+"(", res, n);
        }

        if(close<open){
            generate(open, close+1, ans+")", res, n);
        }
            
        
    }


    
}

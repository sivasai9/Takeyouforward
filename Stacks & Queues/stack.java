import java.util.Arrays;

public class stack {
    public static void main(String[] args) {
        StackImplementationUsingArray st=new StackImplementationUsingArray(10);
        st.push(1);
        System.out.println(Arrays.toString(st.stackArray));

        
    }
    
}

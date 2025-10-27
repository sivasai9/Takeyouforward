import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class preorderiterativr {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<Integer> result = preorder(root);

        // Displaying the inorder traversal result
        System.out.print("Inorder Traversal: ");
        // Output each value in the inorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

        
    }
    public static List<Integer> preorder(Node root) {
        //your code goes here
        List<Integer> ls=new ArrayList<Integer>();

        

        if(root==null){
            return ls;
        }

        Stack<Node> st=new Stack<>();
        st.push(root);

        while (!st.empty()) {
            root=st.pop();
            ls.add(root.data);

            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
            
        }

        return ls;
    }
    
    
}

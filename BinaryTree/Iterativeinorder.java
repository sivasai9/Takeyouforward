import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterativeinorder {
    public static void main(String[] args) {

          Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<Integer> result = inorder(root);

        // Displaying the inorder traversal result
        System.out.print("Inorder Traversal: ");
        // Output each value in the inorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

         

        
    }
     public static List<Integer> inorder(Node root) {
        Stack<Node> st=new Stack<>();
          List<Integer> inorder = new ArrayList<>();

        Node node=root;

        while (true) {
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.empty()){
                    break;
                }
            node=st.pop();
            inorder.add(node.data);
            node=node.right;
            }
        }

        return inorder;

     }
    
}

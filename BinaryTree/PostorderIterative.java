import java.util.*;

public class PostorderIterative {
        public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<Integer> result = postorder(root);

        // Displaying the inorder traversal result
        System.out.print("Post order Traversal: ");
        // Output each value in the inorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

        
    }
    public static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Stack<Node> st = new Stack<>();
        Node current = root;
        Node lastVisited = null;
        
        while (!st.isEmpty() || current != null) {
            if (current != null) {
                st.push(current);
                current = current.left;
            } else {
                Node peekNode = st.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    result.add(peekNode.data);
                    lastVisited = st.pop();
                }
            }
        }
        
        return result;
    }
    
    
}

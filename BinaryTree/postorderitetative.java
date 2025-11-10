import java.util.*;


public class postorderitetative {
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

            if(root.left!=null){
                st.push(root.left);
            }

            if(root.right!=null){
                st.push(root.right);
            }
          
            
        }
        Collections.reverse(ls);

        return ls;
    }
    
    
}

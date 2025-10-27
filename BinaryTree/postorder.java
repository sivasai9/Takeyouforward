import java.util.ArrayList;
import java.util.List;

public class postorder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<Integer> result = postorder(root);

        // Displaying the inorder traversal result
        System.out.print("Inorder Traversal: ");
        // Output each value in the inorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
        
    }
    public static List<Integer> postorder(Node root) {

        List<Integer> ls=new ArrayList<>();

        helper(root,ls);

        return ls;
    
    }
    public static void helper(Node node,List<Integer> ls){
      

        if(node==null){
            return;
        }
        helper(node.left, ls);
        helper(node.right, ls);
        ls.add(node.data);

    }
    
}

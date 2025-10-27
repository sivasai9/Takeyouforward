import java.util.*;

public class Inorder {
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
        
        List<Integer> ls=new ArrayList<Integer>();

        helper(root, ls);

        return ls;


    }

    public static void helper(Node root,List<Integer> ls){

        if(root==null){
            return;
        }

        helper(root.left, ls);
        ls.add(root.data);
        helper(root.right, ls);

    }
    
    
}



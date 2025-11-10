import java.util.*;

public class levelorder {
    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<List<Integer>> result = levelord(root);
        System.out.println(result.size());

        // Displaying the inorder traversal result
        System.out.println("level Traversal: ");
        // Output each value in the inorder traversal result
        for (List<Integer> val : result) {
            for(int num:val){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        
        
    }
    public static List<List<Integer>> levelord(Node root) {
        //your code goes here
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int size=q.size();
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node node=q.poll();
                ls.add(node.data);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            ans.add(ls);
        
        }
        return ans;
    }
}

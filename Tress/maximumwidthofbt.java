import java.util.LinkedList;
import java.util.Queue;

 class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V Value){
        this.key=key;
        this.value=Value;
    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
 }

public class maximumwidthofbt {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        

        int maxWidth = widthOfBinaryTree(root);

        System.out.println("Maximum width of the binary tree is: " + maxWidth);
        
    }

     public static int widthOfBinaryTree(TreeNode root) {
        //your code goes here

        if(root==null){
            return 0;
        }

        int ans=0;

        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        q.offer(new Pair<>(root,0));

        while(!q.isEmpty()){
            int size=q.size();
            int mmin=q.peek().getValue();
            int first=0;
            int last=0;

            for(int i=0;i<size;i++){
                int cur_id=q.peek().getValue()-mmin;

                TreeNode node=q.peek().getKey();

                q.poll();
                if(i==0){
                    first=cur_id;
                }

                if(i==size-1){
                    last=cur_id;
                }
                if(node.left!=null){
                    q.offer(new Pair<>(node.left,cur_id*2+1));
                }

                if(node.right!=null){
                    q.offer(new Pair<>(node.right,cur_id*2+2));
                }

            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;

    }
}

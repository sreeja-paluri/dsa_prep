package problems;
import com.sun.source.tree.Tree;
import java.util.*;

// #94 binary tree inorder traversal
// traverse through the tree left , root , right
public class BinaryTree_Inorder {

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inorder(root , result);
        return result;
    }

    public void inorder(TreeNode root , List<Integer> result){
        if(root == null) return;
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);

    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right =new TreeNode( 2);
        root.right.left = new TreeNode(3);

        BinaryTree_Inorder bst = new BinaryTree_Inorder();
        System.out.println(bst.inorderTraversal(root));
    }
}

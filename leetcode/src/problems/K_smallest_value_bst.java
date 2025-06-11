package problems;


import com.sun.source.tree.Tree;

public class K_smallest_value_bst {
    int count = 0;
    int result = -1;
public int kthSmallestValue(TreeNode root, int k){
    inorder(root, k);
    return result;
}
private void inorder(TreeNode root,int k ){
    if(root == null) return;
    inorder(root.left , k);
    count++;
    if( count == k)
    {
        result = root.val;
        return;
    }
    inorder(root.right, k);
}

public static void main(String[] args){
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.left.left.left = new TreeNode(1);
    root.right = new TreeNode(6);

    K_smallest_value_bst kbst = new K_smallest_value_bst();
    System.out.println(kbst.kthSmallestValue(root , 3));
}
}

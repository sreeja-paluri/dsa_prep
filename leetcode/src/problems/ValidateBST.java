package problems;

public class ValidateBST {
    Integer prev =  null;
    public boolean isValidBST(TreeNode node){

        if(node == null) return true;
        if(! isValidBST(node.left)) return false;
        if(prev != null && node.val <= prev) return false;
        prev = node.val;
        return isValidBST(node.right);

    }
    public static void main(String[] args){
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);

        ValidateBST validator = new ValidateBST();
        System.out.println("Is valid BST? " + validator.isValidBST(root1));  // true

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);

        validator = new ValidateBST();
        System.out.println("Is valid BST? " + validator.isValidBST(root2));
    }
}

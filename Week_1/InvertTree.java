package Week_1;

public class InvertTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        printLevelOrder(root);
        System.out.println();
        printLevelOrder(GenInvertTree(root));
    }

    public static TreeNode GenInvertTree(TreeNode node) {
        if(node == null) {
            return node;
        }

        TreeNode left = GenInvertTree(node.left);
        TreeNode right = GenInvertTree(node.right);

        node.left = right;
        node.right = left;
        return node;
    }

    // Compute the "height" of a tree 
    static int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    // Print nodes at the current level
    static void printCurrentLevel(TreeNode root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.val + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    static void printLevelOrder(TreeNode root)
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }
}


//Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }
}
 

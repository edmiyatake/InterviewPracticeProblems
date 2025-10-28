public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree() {
        root = null ;
    }

    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
        }
        else {
            // iterate through the tree to find the right location
            TreeNode curr = root;
            while (true) {
                if (curr.value < value) {
                    if (curr.left == null) {
                        curr.left = newNode;
                        break;
                    }
                    curr = curr.left;
                }
                else {
                    if (curr.right == null) {
                        curr.right = newNode;
                        break;
                    }
                    curr = curr.right;
                }
            }

        }
    }

    // implement a find algorithm to find closest node to val

    public static void main(String[] args) {
        int[] initialArr= {10, 5, 15, 6, 1, 8, 12, 18, 17};
        BinaryTree tree = new BinaryTree();
        for (int num : initialArr) {
            tree.insert(num);
        }
    }
}
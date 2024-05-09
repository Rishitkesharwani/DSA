package binary_search_tree;

public class print_in_range {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inTraversal(Node root){
        if(root==null){
            return;
        }
        inTraversal(root.left);
        System.out.print(root.data+" ");
        inTraversal(root.right);
    }
    public static void printRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(k1<=root.data && root.data<=k2){
            printRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printRange(root.right,k1,k2);
        } else if (root.data>k2) {
            printRange(root.right,k1,k2);
        }
        else {
            printRange(root.left,k1,k2);
        }
    }
    public static void main(String[] args) {
        int[] values={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for (int i=0;i< values.length;i++){
            root=insert(root,values[i]);
        }

        printRange(root,5,12);
    }
}

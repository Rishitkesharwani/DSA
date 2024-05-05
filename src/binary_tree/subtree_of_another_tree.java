package binary_tree;

public class subtree_of_another_tree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = right = null;
        }
    }

    static class tree {
        static int idx = -1;

        public static Node buidTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left = buidTree(nodes);
            newNode.right = buidTree(nodes);

            return newNode;
        }
    }
    public static boolean isIdentical(Node node,Node subroot){
        if(node==null&& subroot==null){
            return true;
        }else if(node==null|| subroot==null||node.data!=subroot.data){
            return false;
        }
        if(!isIdentical(node.left,subroot.left)){
            return false;
        }
        if (!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public static void main(String[] args) {
       Node root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);

       Node subRoot=new Node(2);
       subRoot.left=new Node(4);
       subRoot.right=new Node(5);
        System.out.println(isSubtree(root,subRoot));
    }
}

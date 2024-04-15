package binary_tree;

public class inorder_treversal {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=right=null;
        }
    }
    static class tree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] ==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
        public static void InorderTraverse(Node root){
            if(root==null){
                return;
            }
            InorderTraverse(root.left);
            System.out.print(root.data +" ");
            InorderTraverse(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree tc= new tree();
        Node root=tc.buildTree(nodes);

        tc.InorderTraverse(root);

    }

}

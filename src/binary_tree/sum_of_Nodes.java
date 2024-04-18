package binary_tree;

public class sum_of_Nodes {
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
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.data;
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree tc=new tree();
        Node root =tc.buildTree(nodes);
        System.out.print(sum(root));
    }
}

package binary_tree;public class counts_of_node {
    static class Node {
        int data;
        Node left, right;

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
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int count=count(root.left)+count(root.right)+1;
        return count;
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree tc=new tree();
        Node root=tc.buildTree(nodes);
        System.out.println(count(root));
    }
}

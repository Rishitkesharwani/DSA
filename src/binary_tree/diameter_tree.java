package binary_tree;

public class diameter_tree {
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
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ldiam=diameter(root.left);
        int lh=height(root.left);
        int rdiam=diameter(root.right);
        int rh=height(root.right);
//        int selfdiam=height(root);
        int selfdiam=lh+rh+1;
        return Math.max(Math.max(ldiam,rdiam),selfdiam);
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree tc=new tree();
        Node root=tc.buildTree(nodes);
        System.out.println(diameter(root));
    }
}

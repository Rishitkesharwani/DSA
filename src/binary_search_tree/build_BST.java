package binary_search_tree;

public class build_BST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else {
            root.right=insert(root.right,val);
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

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for (int i=0;i< values.length;i++){
            root=insert(root,values[i]);
        }
        inTraversal(root);
        System.out.print(" ");
    }
}

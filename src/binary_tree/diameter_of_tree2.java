package binary_tree;

public class diameter_of_tree2 {
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

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    static class info {
        int diam;
        int ht;

        info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static info diameter(Node root) {
        if (root == null) {
            return new info(0, 0);
        }
        info leftinfo = diameter(root.left);
        info rightInfo = diameter(root.right);

        int diameter = Math.max(Math.max(leftinfo.diam, rightInfo.diam), leftinfo.ht + rightInfo.ht + 1);
        int height = Math.max(leftinfo.ht, rightInfo.ht) + 1;
        return new info(diameter, height);
    }

    public static void main(String[] args) {

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        tree tc=new tree();
        Node root=tc.buildTree(nodes);
        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);
    }
}


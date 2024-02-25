package linked_list;

public class size_of_ll {
    public static class node {
        int data;
        node next;

        node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public static node Head;
    public static node tail;
    public static int count;

    public static void start(int val) {
        node newnode = new node(val);
        count++;
        if (Head == null) {
            Head = tail = newnode;
            return ;
        }
        newnode.next = Head;
        Head = newnode;
    }

    public static void print() {
        if (Head == null) {
            System.out.print("Empty");
        }
        node temp = Head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        start(5);
        start(7);
        start(1);

        print();
        System.out.println(count);

    }
}

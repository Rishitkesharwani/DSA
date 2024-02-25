package linked_list;

public class remove_last {
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
    public static int size;

    public static void start(int val) {
        node newnode = new node(val);
        size++;
        if (Head == null) {
            Head = tail = newnode;
            return ;
        }
        newnode.next = Head;
        Head = newnode;
    }
    public static int removefirst(){
        if(size==0){
            System.out.println("Linked list is enpty: ");
            return -1;
        }
        else if(size==1){
            int val=Head.data;
            Head=tail=null;
            size=0;
            return val;
        }
        int val=Head.data;
        Head=Head.next;
        size--;
        return val;
    }
    public static int removelast(){
        if(size==0){
            System.out.println("Linked list is enpty: ");
            return -1;
        }
        else if(size==1){
            int val=Head.data;
            Head=tail=null;
            size=0;
            return val;
        }
        node prev=Head;
        for (int i=0;i<size-2 ;i++ ) {
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void print() {
        if (Head == null) {
            System.out.print("Empty");
        }
        node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        start(5);
        start(7);
        start(1);


        print();
        // removefirst();
        // print();
        removelast();
        print();
        System.out.print("Size of linked list is : ");

        System.out.println(size);

    }
}

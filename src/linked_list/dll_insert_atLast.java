package linked_list;

public class dll_insert_atLast {
    public static class Node{
        int data;
        Node next;
        Node prev;


        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    public static void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if (head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.next=null;
        tail=newnode;

        tail=newnode;


    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addFirst(4);
        addFirst(2);
        addFirst(5);
        print();


        addLast(3);
        addLast(6);
        print();
        System.out.println(size);
    }
}

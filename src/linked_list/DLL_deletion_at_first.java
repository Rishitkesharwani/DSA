package linked_list;

public class DLL_deletion_at_first {
    public static class Node{
        int data;
        dll_insert_atLast.Node next;
        dll_insert_atLast.Node prev;


        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static dll_insert_atLast.Node head;
    public static dll_insert_atLast.Node tail;
    public static int size;

    public static void addFirst(int data) {
        dll_insert_atLast.Node newnode = new dll_insert_atLast.Node(data);
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
        dll_insert_atLast.Node newnode=new dll_insert_atLast.Node(data);
        size++;
        if (head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.next=null;
        tail=newnode;



    }
    public static  int delFirst(){
        if(head==null){
            System.out.println("DLL is empty");
        }
        if (size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public static void print(){
        dll_insert_atLast.Node temp=head;
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

        delFirst();
        print();
        System.out.println(size);
    }
}

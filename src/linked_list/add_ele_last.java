package linked_list;

public class add_ele_last {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void atLast(int val){
        Node newNode=new Node(val);
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=tail;
        tail=newNode;
    }
public static void print(){
        if(head==null){
            System.out.println("linked list is empty: ");
        }
    Node temp=head;
    while (temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        add_ele_last newNode=new add_ele_last();
        newNode.atLast(12);
        print();
        newNode.atLast(15);
        newNode.atLast(14);
        print();
        newNode.atLast(17);
//        add_ele_last temp=new add_ele_last();


    }

}

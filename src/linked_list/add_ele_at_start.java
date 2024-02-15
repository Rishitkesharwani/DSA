package linked_list;

public class add_ele_at_start {
    public static class node{
        int data;
        node next;
        public node(int data ){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static void addFirst(int data){
        // Step1 create new node
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        // step2 - newNode.next=head
        newnode.next=head;

        //step 3 head=newNode
        head=newnode;
    }

    public static void main(String[] args) {
        add_ele_at_start ll=new add_ele_at_start();
        addFirst(1);
        System.out.println(add_ele_at_start.head.data);
        add_ele_at_start ab=new add_ele_at_start();
        addFirst(3);
        System.out.println(add_ele_at_start.head.data);
        System.out.println(add_ele_at_start.head.next.data);

    }

}

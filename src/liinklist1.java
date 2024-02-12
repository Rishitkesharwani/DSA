class node{
    int data;
    node next;
    // constructor
    node(int val){
        this.data=val;
        this.next=null;
    }
}

public class liinklist1 {
        public static node insertAtHead(node head, int val){
            // task1
            node newnode=new node(val);
            // task 2
            newnode.next=head;
            // task 3
            head=newnode;
            return head;

        }
        public static void traverse(node head){
            node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }


        public static void main(String[] args) {
            node head=new node(12);
            head=insertAtHead(head,11);
            head=insertAtHead(head,13);
            head=insertAtHead(head,14);

            traverse(head);
        }


}

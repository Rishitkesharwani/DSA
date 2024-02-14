package linked_list;

public class lisked_list_1stcode {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        node newnode=new node(12);
        System.out.println(newnode.data);
    }
}

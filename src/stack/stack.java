package stack;

import java.util.Stack;

public class stack{
    String[] name;
    int cap,top;
    stack(int size){
        cap=size;
        name =new String[cap];
        top=-1;
    }
    void push(String s){
        if(top+1>cap){
            System.out.println("Overflow");
        }
        else {
            top++;
            name[top]=s;
        }
    }
    String pop() {
        if (top < 0) {
            System.out.println("Underflow");
            return null;
        } else {
            String s = name[top];
            top--;
            return s;
        }
    }
    String peek(){
        if(top<0){
            System.out.println("underflow");
            return null;
        }
        else {
            String s=name[top];
            return s;
        }
    }
    boolean isEmpty(){
        return (top>0);
    }
    void display(){
        for (int i = top; i >=0 ; i--) {
            System.out.println(name[i]);
        }
    }

    public static void main(String[] args) {
        stack names=new stack(7);
        names.push("Rishit");
        names.push("xyz");
        names.display();
//        String s=names.peek();
//        System.out.println(s);
//        s=names.peek();
//        System.out.println(s);
    }
}
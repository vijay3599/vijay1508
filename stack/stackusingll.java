class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedstack{
    private Node top;
    public linkedstack(){
        top=null;
    }
    public void push(int data){
        Node newnode=new Node(data);
        newnode.next = top;
        top=newnode;
        System.out.println(data+" pushed");

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack empty");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("stack empty");
            return ;
    }
    Node temp=top;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
    System.out.println();
}
}
public class stackusingll {
    public static void main(String[] args) {
        linkedstack stack=new linkedstack();

        stack.push(10);
         stack.push(20);
          stack.push(30);
          stack.display();
          System.out.println("top element"+stack.peek());
          System.out.println("popped"+stack.pop());
          System.out.println("popped"+stack.pop());
          stack.display();
        
    }
}

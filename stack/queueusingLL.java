class Node{
    int data;
    Node next;
   public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class QueueLL{
    Node front,rear;
    public QueueLL(){
        this.front=this.rear=null;
    }
    void enqueue(int data){
       Node newnode=new Node(data);
       if(rear==null){
        front=rear=newnode;
        System.out.println(data+ "added");
        return;
       } 
       rear.next=newnode;
       rear=newnode;
       System.out.println(data+ " added");
    }
    int dequeue(){
        if(front==null){
            System.out.println("queue empty");
            return-1;
        }
        int item=front.data;
        front=front.next;
        
        if(front==null)
        rear=null;
        return item;
    }
    int peek(){
        if(front==null){
            System.out.println("empty queue");
            return -1;
        }
        return front.data;
    }
    boolean isEmpty(){
        return front==null;
    }
    void display(){
        if(front==null){
            System.out.println("queue empty");
            return;
        }
        System.out.println("Queue Element is:");
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class queueusingLL {
   public static void main(String[] args) {
    QueueLL q=new QueueLL();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.display();
    System.out.println("Front Element"+q.peek());
    System.out.println("removed"+q.dequeue());
    q.display();
    q.enqueue(60);
    q.enqueue(70);
    q.display();
   } 
}


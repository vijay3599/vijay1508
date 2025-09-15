class node{
    int data;
    node next;

    node(int d){
        data=d;
    next=null;
    }
}
class LinkedList{
    node head;

    void insertAtEnd(int d){
     node newnode=new node(d);

     if(head==null){
        head=newnode;
        return;
     }
     node temp=head;
     while(temp.next !=null){
        temp=temp.next;
     }
     temp.next=newnode;
    }

    void printList(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class endinsert {
    public static void main(String[] args) {
       LinkedList list=new LinkedList();
      list.insertAtEnd(12);
      list.insertAtEnd(13);
      list.insertAtEnd(14);
        list.printList();
    }
}

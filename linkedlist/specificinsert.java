class Node{
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
    }
}
class LinkedList{
    Node head;

    void insertAtSpecific(int d,int position){
        Node newnode=new Node(d);
        if(position==1){
            newnode.next=head;
            head=newnode;
            return;
        }
        Node temp=head;
        int count=1;

        while(temp!=null && count<position-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("position out of range");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class specificinsert {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.insertAtSpecific(10, 1);
        list.insertAtSpecific(29, 2);
        list.insertAtSpecific(25, 2);
        list.printList();
    }
}

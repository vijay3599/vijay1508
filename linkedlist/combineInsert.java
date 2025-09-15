class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class LL{
    Node head;
     void insertAtbeginning(int d){
        Node newNode=new Node(d);
        newNode.next=head;
        head=newNode;
     }
     void insertAten(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
     }
     void insertAtPosition(int d,int position){
        Node newNode=new Node(d);
        if(position==1){
            newNode.next=head;
            return;
        }
        Node temp=head;
        int count=1;
        while(temp!=null && count<position-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("postion out of range");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
     }
     void printListl(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
     }
}
public class combineInsert {
    public static void main(String[] args) {
        LL list=new LL();

        list.insertAtbeginning(10);
        list.insertAtbeginning(20);
        list.insertAten(30);
        list.insertAtPosition(40, 2);
        list.printListl();
        
    }
}

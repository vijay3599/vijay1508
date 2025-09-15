class node{
    int data;
    node next;
    node(int d){
        data=d;
        next=null;
    }
}
class linkedList{
    node head;

    void insertAtbegning(int d){
        node newnode=new node(d);
        newnode.next=head;
        head=newnode;
    }
    void printList(){
    node temp=head;
    while(temp !=null){
        System.out.print(temp.data +"-->");
        temp=temp.next;
    }
    System.out.println("null");
    }

}
public class startinginsert {
    public static void main(String[] args) {
        linkedList list=new linkedList();
        list.insertAtbegning(10);
        list.insertAtbegning(20);
        list.insertAtbegning(30);

        list.printList();
        
    }
}

class node{
    int data;
    node next;
    node(int d){
        this.data=d;
        this.next=null;

    }
}
class LL{
    node head;

    void add(int val){
        node newnode=new node(val);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void diplayList(){
        node curr=head;

        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    void reverse(){
        node prev=null;
        node curr=head;
        node nxt=null;

        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head=prev;

    } 
    }

public class reversee {
    public static void main(String[] args) {
        LL list=new LL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
         System.out.println("link lsit before revrese");
        list.diplayList();

        System.out.println("after reverse");
       list.reverse();
       list.diplayList();
       
        
    }
}

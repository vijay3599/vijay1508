class mystack{
    int arr[];
    int top;
    int capacity;
    //constructor
    public mystack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int data){
    if(isFull()){
        System.out.println("can not push "+data);
        return ;
    }
    top=top+1;
    arr[top]=data;
    System.out.println(data+" push into stack");
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("can not pop");
            return -1;
        }
        int value=arr[top];
        top=top-1;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("cant peek");
            return -1;
        }
        return arr[top];
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("cant dispaly stack is empty");
            return;
        }
        System.out.println("stack Element:");
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
public class poppuah {
    public static void main(String[] args) {
        mystack stack=new mystack(7);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println("top Element "+stack.peek());
        System.out.println("poped element "+stack.pop());
        System.out.println("after pop");
        stack.display();

        
    }
}

class stack{
    int arr[];
    int top;
    int capacity;

    
    
   public stack(int size ){
        arr=new int [size];
        top=-1;
        capacity=size;
    }
     public void push(int ele){
       if(isFull()){
        System.out.println("stack is overflow"+ele);
        return;
       }
       top++;
       arr[top]=ele;
       System.out.println("pushed"+ele);
     
    }
     public int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        int temp=arr[top];
        top--;
        return temp;
        
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("cannot peek is empty");
            return-1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(top==capacity-1){
            return true;
        }
        return false;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return ;
        }
        System.out.println("stack elemeent:");
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    

}
public class push {
    public static void main(String[] args) {
        stack st=new stack(10); 
        System.out.println("Stack is empty");

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        st.display();
        System.out.println("top element of stack is "+st.peek());
        System.out.println("popped "+st.pop());
        st.display();
        
        st.push(7);
        st.push(8);
        
        
}
}


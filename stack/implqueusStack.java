import java.util.*;
class myqueue{
    Stack<Integer>s1;
      Stack<Integer>s2;

      public myqueue(){
        s1=new Stack<>();
        s2=new Stack<>();
      }
      public void push(int x){
        s1.push(x);
      }
      public int pop(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
            s2.push(s1.pop());

        }
      }
      return s2.pop();
    }
    public int peek(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
            s2.push(s1.pop());

        }
      }
      return s2.peek();
    }
    
    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
}

public class implqueusStack {
    public static void main(String[] args) {
         myqueue q = new myqueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Pop: " + q.pop());   
        System.out.println("Peek: " + q.peek()); 
        System.out.println("Pop: " + q.pop());   
        System.out.println("Pop: " + q.pop());  
        System.out.println("Is Empty? " + q.isEmpty());
        
    }
}

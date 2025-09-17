class queueArr{
    int arr[];
    int front;
    int rear;
    int capacity;
    int count;
    public queueArr(int size){
        arr=new int [size];
        capacity=size;
        front=0;
        rear=-1;
        count=0;
    }
         void enqueue(int data){
            if(isFull()){
                System.out.println("cant push "+data);
                return;
            }
             arr[++rear]=data;
             count++;
             System.out.println(data+" added");
        }
        int dequeue(){
            if(isEmpty()){
                System.out.println("cant dequeue");
                return -1;
            }
            int item=arr[front];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            count--;
            return item;
        }
          int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }
        boolean isEmpty(){
            return count==0;
        }
        boolean isFull(){
            return count==capacity;
        }
        void display(){
            if(isEmpty()){
                System.out.println("Empty");
                return;
            }
            System.out.println("Queue Element: ");
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }

public class queueusingarr{
    public static void main(String[] args) {
        queueArr q=new queueArr(5);
        q.enqueue(10);
         q.enqueue(20);
          q.enqueue(30);
           q.enqueue(40);
            q.enqueue(50);
            q.display();

            System.out.println("front Element: "+q.peek());
            System.out.println("removed: "+q.dequeue());
            q.display();
            q.enqueue(60);
            q.enqueue(70);
            q.display();

    }
}
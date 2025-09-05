     class student{
        String Name;
        int age;

        void displyDetial(String name, int age){
            System.out.println("Name of the Student: " + name);
            System.out.println("age of the Student: "+ age);
        }
        void displyDetial(String name){
            System.out.println("Name of the Student: "+ name);
     }
     void displyDetial( int age){
            System.out.println("age of the Student: "+ age);
    }
}


public class overloding {

    public static void main(String[] args) {
        student vijay= new student();
        vijay.displyDetial("vijay", 23);

        student kartik=new student();
        kartik.displyDetial("kartik");

        student pavan=new student();
        pavan.displyDetial(35);
    }
}

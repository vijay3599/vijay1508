package arrays;
class student{
    String name;
    int marks;

student(String name,int marks){
    this.name=name;
    this.marks=marks;
}
void display(){
    System.out.println("name:"+name+" marks"+marks);
}
}
public class classobject {
    public static void main(String[] args) {
        student s1=new student("vijay",99);
        student s2=new student("shrvan",99);
        student s3=new student("sarthak",99);

        s1.display();
        s2.display();
        s3.display();
    }
    
}

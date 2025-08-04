import java.util.Scanner;

public class datatype {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("inter the value Integer");
        int a=sc.nextInt();
        System.out.println("inter the value float");
        float b=sc.nextFloat();
        System.out.println("inter the value double");
        double c=sc.nextDouble();
        System.out.println("inter the value Ichar");
        char d=sc.next().charAt(0);
        System.out.println("inter the value String");
        String e=sc.next();
         sc.close();

         System.out.println("the value are emtire that");
         System.out.println("integer:"+a);
         System.out.println("float:"+b);
         System.out.println("double:"+c);
         System.out.println("char:"+d);

         System.out.println("String:"+e);


    }
    
}

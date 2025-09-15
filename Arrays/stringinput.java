package arrays;
import java.util.*;

public class stringinput {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of string ");
        int n=sc.nextInt();
        sc.nextLine();

        String arr[]=new String[n];

        

        for(int i=0;i<n;i++){
         arr[i]=sc.nextLine();
        }
        String str="";
        for(int i=0;i<n;i++){
            str=str+arr[i];
        }
        System.out.println(str);
    }
}

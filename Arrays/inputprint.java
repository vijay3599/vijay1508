package Arrays;
import java.util.*;

public class inputprint {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

       System.out.println("enter size of array");
        int n=sc.nextInt();

        //create arry
        int arr[]=new int[n];
        
        System.out.println("enter the "+n+"size of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("you enter");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
}

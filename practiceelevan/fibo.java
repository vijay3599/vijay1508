package practiceelevan;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int first=0,second=1;
        for(int i=1;i<=n;i++){
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}

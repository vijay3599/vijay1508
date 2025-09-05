package practiceelevan;

public class fibonacii {

    public int fibo(int n){

        if(n==0){

            return -1;
        }
        return fibo(n*n-1);
    }

    public static void main(String str[]){
        int n=4;
        fibonacii f=new fibonacii();
        f.fibo(n);

    }

}

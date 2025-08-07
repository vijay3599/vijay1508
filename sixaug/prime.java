package sixaug;

public class prime {

    public static void main(String[] args) {
        
        int num=3;
        boolean isprime=true;

        if(num<=1){
            System.out.println("is not prime");
        }else {

            for(int i=2;i<=num-1;i++){

                if(num%i!=0){
                    isprime=true ;
                    break;
                }
                else{
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime==true){
            System.out.println("prime ");
        }else{
            System.out.println("is not prime ");
        }
    }
}

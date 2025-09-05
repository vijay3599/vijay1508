package practiceelevan;

public class skip {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%5==0 || i%7==0){

                continue;
            }
            System.out.print(i+ " ");
        }
    }
}

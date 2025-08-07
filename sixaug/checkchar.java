package sixaug;

public class checkchar {
    public static void main(String[] args) {
        int num;
         char ch='A';
         String str;
         str="hello vijay";
         if(ch>=65 && ch <=90){
            System.out.println("charcter is capital");
            num=ch;
            num=num+32;
            ch=(char)num;
            System.out.println(ch);
         }
         else{
            System.out.println("small");
         }

    }
    
}

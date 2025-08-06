package sixaug;

public class conditionalstatement {
    public static void main(String[] args) {
        int temp =23;
        if(temp<15){
            System.out.println("cold");
        }
        else if(temp>=15 && temp<28){
            System.out.println("normal");
        }
        else if(temp>=28 && temp<38){
            System.out.println("warm");
        }
        else{
            System.out.println("hot");
        }
    }
    
}

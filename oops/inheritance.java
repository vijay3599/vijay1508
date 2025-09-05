class shape  {
void acalculatearea(){
    System.out.println("acalculatearea");
}    
}

class triangle extends shape{
    void acalculatearea(int l, int h){
        System.out.println((l*h)/2);
    }
}
class rectangle extends shape{
    void acalculatearea(int l, int h){
        System.out.println((l*h)/2);
    }
}

public class inheritance {
    public static void main(String[] args) {
        
    }
}

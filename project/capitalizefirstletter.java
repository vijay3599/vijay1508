public class capitalizefirstletter {
    public static void main(String[] args) {
        String str = "hello world";
        
      
        if (str != null && str.length() > 0) {
            
            String result = str.substring(0, 1).toUpperCase() + str.substring(1);
            System.out.println(result); 
        }
    }
}

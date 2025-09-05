public class reverse {
    public static void main(String[] args) {
        String str="Profcymadev";
        str=str.toLowerCase();
        StringBuilder str1=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            str1=str1.append(ch);

        }
        System.out.println(str1);
        
   
    }
}

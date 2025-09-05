public class reversestring {
    public static void main(String[] args) {
        String str="vijay";
        String rv=" ";
        for(int i=str.length()-1;i>=0;i--){
            rv=rv+str.charAt(i);
        }
        System.out.println(rv);
    }
}

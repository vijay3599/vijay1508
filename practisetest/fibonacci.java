public class fibonacci {
    public static void main(String[] args) {
        int num=5;
        int first=0;
        int second=1;
        for(int i=0;i<num;i++){
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}

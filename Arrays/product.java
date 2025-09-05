package Arrays;

public class product {
    public static void main(String[] args) {
        int arr[]={3,5,5};
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        System.out.println(product);
    }
}

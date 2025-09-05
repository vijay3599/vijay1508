package Arrays;

public class minimumele {
    public static void main(String[] args) {
        int arr[]={5,6,78,3,4,5,67,3,4,6,9};
        int n=arr.length;
        int min=arr[0] ;
        for(int i=1;i<n;i++){
            if(min>arr[i]){  //maximum find case only change >=<
                min=arr[i];
            }
            
        }
        System.out.println(min);
    }
}

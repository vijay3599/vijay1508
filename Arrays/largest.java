package arrays;

public class largest {
    public static void main(String args[]){
    int arr[]={4,5,3,6,8,45,94,65,43,56,76,88,};
    int largest=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
            
        }
        
    }
    System.out.println("Largest element in the array is"+largest);
}
}

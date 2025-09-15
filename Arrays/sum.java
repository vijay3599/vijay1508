package arrays;

public class sum {
    public static void main(String args[]){
        int arr[]={2,4,5,4,6};
        int n=arr.length;
        int sum=0;
        double avg;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            avg=(double) sum/n;
        }
        avg=(double) sum/n;
        System.out.println(sum);
        System.out.println(avg);
    }
}

package arrays;

public class mearge {
    public static void main(String[] args) {
        int arr1[]={1,3,5,0,0,0};
        int arr2[]={2,4,6};
        int n=3;
        int m=3;
        int k=n+m-1;
        int i=n-1;
        int j=m-1;

        while(i>=0 && j>=0){
            if(arr1[i]<arr2[j]){
                arr1[k]=arr2[j];
                j--;
            }
            else{
                arr1[k]=arr1[i];
                i--;
            }
            k--;
        }
        while(j>=0){
            arr1[k]=arr2[j];
            j--;
            k--;
        }
        while(i>=0){
            arr1[k]=arr1[i];
            i--;
            k--;
    }
    for(int num:arr1){
        System.out.println(num+" ");
    }
}
}

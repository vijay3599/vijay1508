package arrays;

public class serchelement {
    public static void main(String[] args) {
        int arr[]={3,15,6,7,4,5,6,17,8,9};
        int n=arr.length;
        int search=1;
        boolean found=false;
        for(int i=0;i<n;i++){
        if(arr[i]==search){
            System.out.println("element found at index"+" "+i);
            found=true;
             break;
        }
    }
       
        if(!found){
            System.out.println("not found");
        }
        }
    }

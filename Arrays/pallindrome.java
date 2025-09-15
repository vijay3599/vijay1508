package arrays;

public class pallindrome {
    public static void main(String[] args) {
        String str="madam";
        int left=0;
        boolean ispallindrome= true;
        int right=str.length()-1;
        str=str.toLowerCase();
        
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
            ispallindrome=false;
            break;
            }
            left++;
            right--;
        
            
        }
        if(ispallindrome){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }

    }
}

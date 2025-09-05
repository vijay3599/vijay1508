package practiceelevan;

public class opertor {
    public static void main(String[] args) {
        int num1=23;
        int num2=32;
        char ch='*';
        double result;
        switch (ch) {
            case '+':
                result=num1+num2;
                System.out.println(result);
                break;
                case '-':
                result=num1-num2;
                System.out.println(result);
                break;
                case '*':
                result=num1*num2;
                System.out.println(result);
                break;
                case '/':
                result=num1/num2;
                break;
                case '%':
                result=num1%num2;
                break;
        
            default:
            System.out.println("enter a opertor");
                break;
        }
    }
    
}

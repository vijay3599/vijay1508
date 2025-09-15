class Main
{
    public double squareRoot(double num) 
    {
        return Math.sqrt(num);
    }
    public double cubeRoot(double num)
    {
        return Math.cbrt(num);
    }
    public int factorial(int n) 
    {
        int result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }
    public long factorial(long n) 
    {
        long result = 1;
        for (long i = 1; i <= n; i++) 
        {
            result *= i;
        }
        return result;
    }
}

public class MathOperations
{
    public static void main(String[] args) 
    {
        Main math = new Main();
        System.out.println("Square root : " + math.squareRoot(25));
        System.out.println("Cube root : " + math.cubeRoot(27));
        System.out.println("Factorial (integer): " + math.factorial(5));
        System.out.println("Factorial (long): " + math.factorial(20L));
    }
}


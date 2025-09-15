class Main 
{
    public String reverse(String str) 
    {
        return new StringBuilder(str).reverse().toString();
    }
    public String capitalize(String str) 
    {
        if (str == null || str.isEmpty())
        {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }


    public String append(String base, String toAppend) 
    {
        return base + toAppend;
    }

    public String append(String base, char toAppend)
    {
        return base + toAppend;
    }

    public String append(String base, int toAppend) 
    {
        return base + toAppend;
    }
}
public class StringManipulator
 {
    public static void main(String[] args) {
        Main p = new Main();
        System.out.println("Reverse of 'hello': " + p.reverse("hello"));

        System.out.println("Capitalize 'java': " + p.capitalize("java"));
        System.out.println("Capitalize 'pYTHON': " +p.capitalize("pYTHON"));


        System.out.println("Append string: " + p.append("Hello", " World"));
        System.out.println("Append char: " + p.append("Hello", '!'));
        System.out.println("Append int: " + p.append("Number: ", 123));
    }
}


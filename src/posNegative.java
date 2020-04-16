import java.util.Scanner;

public class posNegative {
    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        num = input.nextInt();
        if(num > 0)
        {
            System.out.println(num + " " + "is positive ");
        }
        else if(num < 0)
        {
            System.out.println(num + " " + "is negative ");
        }
        else
        {
            System.out.println(num + "" + "is neither positive nor negative ");
        }
    }
}

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double Cel = 0;
        double fahr = 0;
        String trash = "";


        System.out.print("Enter your temperature in Celsius: ");


        if(in.hasNextDouble())
        {
            Cel = in.nextDouble();
            in.nextLine();
            fahr = (Cel * 1.8) + 32;
            System.out.println("Your temperature in Fahrenheit would be " + fahr);
        }
        else
        {
            System.out.println("You have entered an invalid input");
        }

    }
}
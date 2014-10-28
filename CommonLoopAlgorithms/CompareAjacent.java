import java.util.Scanner;

public class CompareAjacent
{
    /**
     * Detects duplicate adjacent number in the specfic series of numbers.
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type q to quit): ");
        
        double preValue = in.nextDouble();
        
        while(in.hasNextDouble())
        {
            double value = in.nextDouble();
            if(preValue == value)
            {
                System.out.println(preValue+ " is a duplicate");
            }
            preValue = value;
        }
    }
}
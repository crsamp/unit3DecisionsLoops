import java.util.Scanner;

public class SumAndAverage
{
    /**
     * computes the sum and average of the specified series of numbers.
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of number, type 'q' to exit." );
        
        double total = 0;
        int count = 0;
        double average = 0;
        while( in.hasNextDouble())
        {
            double value = in.nextDouble();
            total += value;
            count++;
            
        }
        if(count >0){
        average = total/count;
    }
        System.out.println("Average is equal to: "+average);
        System.out.println("The total sum is equal to: "+total);
    
    }
}

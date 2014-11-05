import java.util.Random;
import java.util.Scanner;

public class MontyHall
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random doorPicker = new Random();
        System.out.println("What door would you like to pick?: ");
        int usersDoor = in.nextInt();
        String doorOne = "";
        String doorTwo = "";
        String doorThree = "";
        int carDoor = doorPicker.nextInt(3)+1;
        int gameHostPick = 0;
        if(carDoor == 1)
        {
            doorOne = "car";
            doorTwo = "goat";
            doorThree = "goat";
            gameHostPick = doorPicker.nextInt(2)+2;
        }
        if(carDoor == 2)
        {
            doorOne = "goat";
            doorTwo = "car";
            doorThree = "goat";
            if(gameHostPick == 0)
            {
                int hostPick = doorPicker.nextInt(2)+1;
                if(hostPick == 1)
                {
                    gameHostPick = 1;
                }
                if(hostPick == 2)
                {
                    gameHostPick = 3;
                }
            }
        }
        if(carDoor == 3)
        {
            doorOne = "goat";
            doorTwo = "goat";
            doorThree = "car";
            gameHostPick = doorPicker.nextInt(2)+1;
        }
    
        
        
        
    }
}
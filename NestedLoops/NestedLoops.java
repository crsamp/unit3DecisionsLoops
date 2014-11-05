

public class NestedLoops
{
    public static void main(String[] args)
    {
        
        int value = 1;
        for (int i = 1; i<5; i++)
        {
            System.out.println(value + " " +i);
            if (i==4)
            {
                value++;
                i = 0;
                if(value >2)
                {
                    break;
                }
            }
        }
    }
}
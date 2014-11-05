
public class NestedWhile
{
    public static void main(String[] args)
    {
        int i = 1;
        int value = 1;
        
        while (i<5)
        {
            
            
            while (value <3)
            {
                if (i == 5)
                {
                    value++;
                    i = 1;
                }
                if (value == 3 && i == 1)
                {
                    break;
                }
                System.out.println(value + " " + i);
                i++;
            }
            
        }
    }
}
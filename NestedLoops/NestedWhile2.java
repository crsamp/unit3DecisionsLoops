
public class NestedWhile2
{
   public static void main(String[] args)
   {
       int i = 1;
       int value = 1;
       
       while (value <2 && i < 5)
       {
           System.out.println(value + " " +i);
           i++;
           while (i == 4 && value < 3)
           {
               value++;
               i = 1;
            }
        }
   }
}
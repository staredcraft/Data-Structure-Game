
import java.util.*;
/*
   Simple dice class
*/
public class Dice
{
   Random r = new Random();
   
   int sixD3()
   {
      int numberOfD3 = d6();
      int result = 0;
      int i = 1;
      while (numberOfD3 > 0)
      {
         result = result + d3();
         System.out.println("Dice roll: " + i + " Result: " + result);
         i++;
         numberOfD3--;
      }
      System.out.println("End result: " + result);
      return result;
   }
   
   int d3()
   {
      int newRandom = r.nextInt(3-0) + 1;
      return newRandom;
   }
   
   int d6()
   {
      int newRandom = r.nextInt(6-0) + 1;
      return newRandom;
   }
   
   int d15()
   {
      int newRandom = r.nextInt(15-0) + 1;
      return newRandom;
   }
   
   int d20()
   {
      int newRandom = r.nextInt(20-0) + 1;
      return newRandom;
   }
}

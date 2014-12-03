
import java.util.*;
/*
   Simple dice class
*/
public class Dice
{
   Random r = new Random();
   
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

import java.util.*;
/*
   Simple dice class
   Author: Dante Gennero
*/
public class Dice
{
   Random r = new Random();
   
   // 3 sided die roll.
   public int d3()
   {
      int newRandom = r.nextInt(3-0) + 1;
      return newRandom;
   }
   
   // 6 sided die roll.
   public int d6()
   {
      int newRandom = r.nextInt(6-0) + 1;
      return newRandom;
   }
   
   // 15 sided die roll.
   public int d15()
   {
      int newRandom = r.nextInt(15-0) + 1;
      return newRandom;
   }
   
   // 20 sided die roll.
   public int d20()
   {
      int newRandom = r.nextInt(20-0) + 1;
      return newRandom;
   }
   
   // 1-6 3 sided die roll.
   public int d6D3()
   {
      int result = 0;
      
      for (int i = 0; i < d6(); i++)
      {
         result += d3();
      }
      
      return result;
   }
}

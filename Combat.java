
import java.util.*;

public class Combat
{
   static Queue<fakecharacter> queue = new Queue();
   public static void main(String[] args)
   {
      //fakecharacter(String newName, int Hp, int Str, int Dex, int Int, int Weap, int Arm)
      Dice die = new Dice();
      fakecharacter One = new fakecharacter("One", 20, 20, 5, 5, 0, 0);
      fakecharacter Two = new fakecharacter("Two", 20, 5, 19, 5, 0, 0);
      fakecharacter Three = new fakecharacter("Three", 5, 20, 20, 5, 0 ,0);
      fakecharacter Four = new fakecharacter("Four", 50, 20, 5, 5, 0 ,0);
      
      fakecharacter active;
      queue.add(Three);
      System.out.println("Three is first");
      queue.add(Two);
      System.out.println("Two is second");
      queue.add(One);
      System.out.println("One is last");
      
      for (int i = 0; i < 20; i++)
      {
         active = queue.remove();
         System.out.println(active.getName() + "'s turn.");
         fight(active, Four);
         queue.add(active);
      }
      
   }
   
   static void fight(fakecharacter agg, fakecharacter def)
   {
      if (agg.getActive())
      {
         if (def.getActive())
         {
            if ( 20 > def.getDex())
            {
               int damage;
               damage = agg.getStr() / 3 + agg.getWeap() - def.getArm();
               
               def.setHp(def.getHp() - damage );
               if ( def.getHp() < 0)
               {
                  System.out.println(  agg.getName() + " hit " + def.getName() + " for " + damage + 
                     " damage " + def.getName() + " has died");
                     def.setDeactive();
               }
               else
               {
                  System.out.println( agg.getName() + " hit " + def.getName() + " for " + damage + 
                     " damage " + def.getName() + " has " + def.getHp() + " left.");
               }
            }
            else
            {
               System.out.println(agg.getName() + " missed " + def.getName());
            }
         }
         else
         {
            System.out.println(def.getName() + " has died and cannot be attacked");
         }
      }
      else
      {
         System.out.println(agg.getName() + " has died and cannot attack");
      }
   }
}

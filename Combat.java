package finalproj;
import java.util.*;

public class Combat
{
   public static Queue<Character> queue = new Queue();
   protected static Dice die = new Dice();
   public static void main(String[] args)
   {
      //Character(String newName, int Hp, int Str, int Dex, int Int, int Weap, int Arm)
     
      Character pOne = new Character("One", 20, 20, 20, 5, 0, 0);
      Character pTwo = new Character("Two", 20, 5, 19, 19, 0, 0);
      Character pThree = new Character("Three", 5, 20, 18, 5, 0 ,0);
      Character pFour = new Character("Four", 50, 20, 12, 5, 0 ,0);      
      
      Character active;
      queue.add(pThree);
      System.out.println("Three is first");
      queue.add(pTwo);
      System.out.println("Two is second");
      queue.add(pOne);
      System.out.println("One is last");
      
      for (int i = 0; i < 20; i++)
      {
         active = queue.remove();
         System.out.println(active.getName() + "'s turn.");
         magicAttack(active, pFour);
         active.setSpell(2);
         queue.add(active);
      }
      
   }
   
   //This is the actual attack action. Should be called by the Queue after all characters select their actions.
   static void meleeAttack(Character agg, Character def)
   {
      activeCheck(agg, def);
      if ( die.d20() > def.getDex())
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
   
   //This is the actual magic action. Should be called by the Queue after all characters select their actions.
   static void magicAttack(Character agg, Character def)
   {
      activeCheck(agg, def);
      if (agg.hasSpell())
      {
         if ( die.d20() > def.getDex())
         {
            int damage;
            int weap = agg.getWeap();
            
            if (agg.getWeap() == 5 || agg.getWeap() == 6)
            {
               weap = weap - 4;
            }
            else
            {
               weap = 0;
            }
            
            damage =  agg.getInt() / 3 + agg.useSpell() + weap - def.getArm();
            
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
        System.out.println(agg.getName() + " doesn't have a spell memorized");
      }
   }
   
   //This is the actual range action. Should be called by the Queue after all characters select their actions.
   static void rangeAttack(Character agg, Character def)
   {
      activeCheck(agg, def);
      if (agg.getWeap() == 3 || agg.getWeap() == 4)
      {
         if ( die.d15() > def.getDex())
         {
            int damage;
            damage = agg.getStr() / 3 + agg.getWeap() - 2/*for weapon damage */ - def.getArm();
            
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
         System.out.println(agg.getName() + " doesn't have a ranged weapon.");
      }    
       
   }
   
   // Sets characters hide.
   public void Hide(Character hider)
   {
      hider.setHide();
   }
   
   // Checks if characters are active or not.
   static boolean activeCheck(Character agg, Character def)
   {
      boolean result = false;
      if (agg.getActive())
      {
         if(def.getActive())
         {
            if(def.getHide() == false)
            {
               result = true;
            }
            else
            {
               System.out.println(def.getName() + " is hiding and was not attacked");
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
      return result;
   }
}

import java.util.*;
/*
   Combat Class (Holds calls for actual combat)
   Author: Dante Gennero
*/
public class Combat
{
   protected Dice die = new Dice();
   
   //This is the actual attack action. Should be called by the Queue after all characters select their actions.
   public String meleeAttack(Being agg, Being def)
   {
      activeCheck(agg, def);
      if ( die.d20() > def.getDex())
      {
         int damage;
         damage = agg.getStr() / 3 + agg.getWeapon() - def.getArm();
         agg.useWeap();
         def.useArmor();
         def.setHp(def.getHp() - damage );
         if ( def.getHp() < 0)
         {
             def.setDeactive();
             return agg.getName() + " hit " + def.getName() + " for " + damage + 
               " damage " + def.getName() + " has died";
               
         }
         else
         {
            return agg.getName() + " hit " + def.getName() + " for " + damage + 
               " damage " + def.getName() + " has " + def.getHp() + " left.";
         }
      }
      else
      {
         return agg.getName() + " missed " + def.getName();
      }
   }
   
   //This is the actual magic action. Should be called by the Queue after all characters select their actions.
   public String magicAttack(Being agg, Being def)
   {
      activeCheck(agg, def);
      if (agg.hasSpell())
      {
         if ( die.d20() > def.getDex())
         {
            int damage;
            int weap = agg.getWeapon();
            
            if (agg.getWeapon() == 5 || agg.getWeapon() == 6)
            {
               weap = weap - 4;
            }
            else
            {
               weap = 0;
            }
            
            damage =  agg.getInt() / 3 + agg.useSpell() + weap - def.getArm();
            agg.useWeap();
            def.useArmor();
            def.setHp(def.getHp() - damage );
            if ( def.getHp() < 0)
            {
               def.setDeactive();
               return  agg.getName() + " hit " + def.getName() + " for " + damage + 
                  " damage " + def.getName() + " has died";
                  
            }
            else
            {
               return agg.getName() + " hit " + def.getName() + " for " + damage + 
                  " damage " + def.getName() + " has " + def.getHp() + " left.";
            }
         }
         else
         {
            return agg.getName() + " missed " + def.getName();
         }
      }
      else
      {
        return agg.getName() + " doesn't have a spell memorized";
      }
   }
   
   //This is the actual range action. Should be called by the Queue after all characters select their actions.
   public String rangeAttack(Being agg, Being def)
   {
      activeCheck(agg, def);
      if (agg.getWeapon() == 3 || agg.getWeapon() == 4)
      {
         if ( die.d15() > def.getDex())
         {
            int damage;
            damage = agg.getStr() / 3 + agg.getWeapon() - 2/*for weapon damage */ - def.getArm();  
            agg.useWeap();
            def.useArmor();
            def.setHp(def.getHp() - damage );
            if ( def.getHp() < 0)
            {
               def.setDeactive();
               return agg.getName() + " hit " + def.getName() + " for " + damage + 
                  " damage " + def.getName() + " has died";
                  
            }
            else
            {
               return agg.getName() + " hit " + def.getName() + " for " + damage + 
                  " damage " + def.getName() + " has " + def.getHp() + " left.";
            }
         }
         else
         {
            return agg.getName() + " missed " + def.getName();
         }
      }
      else
      {
         return agg.getName() + " doesn't have a ranged weapon.";
      }    
       
   }
   
   // Sets characters hide.
   public void Hide(Being hider)
   {
      hider.setHide();
   }
   
   // Checks if characters are active or not.
   private boolean activeCheck(Being agg, Being def)
   {
      boolean result = false;
      String s;
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
   
   public String returnResult(String s)
   {
       return s;
   }
           
}

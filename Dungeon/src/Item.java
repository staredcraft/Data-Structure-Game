import java.util.*;
/*
   Item Class (Holds Weapons or Armors. It also holds their durability.
   Author: Dante Gennero
*/
public class Item
{ 
   String name;
   int weapon;
   int armor;
   int durability;
   // default constructor changes item stats later.
   Item()
   {
      name = "";
      weapon = 0;
      armor = 0;
   }
   // Sets weapon stats.
   public void setWeapon(String name, int i)
   {
      name = name;
      weapon = i;
      durability = 50;
   }
   // Sets armor stats.
   public void setArmor(String name, int i)
   {
      name = name;
      armor = i;
      durability = 50;
   }
   // Returns weapon damage.
   public int getWeapon()
   {
      return weapon;
   }
   // Returns armor damage blocked.
   public int getArmor()
   {
      return armor;
   }
   // Returns durability. So we can see how long until it breaks.
   public int getDurability()
   {
      return durability;
   }
   // Uses the item and lowers its durability.
   public void itemUsed()
   {
      durability = durability - 1;
      if (durability == 0)
      {
         weapon = 0;
         armor = 0;
      }
   }
}

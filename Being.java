package finalproj;
import java.util.*;
/*
   Being class. Will randomly generate character stats.
   Author: Dante Gennero
*/
public class Being
{
   protected String Name;
   protected String Desc;
   protected int Hp;
   protected int Str;
   protected int Dex;
   protected int Int;
   protected Item Weap = new Item();
   protected Item Arm = new Item();
   protected int Spell;
   protected String profession;
   protected boolean active;
   protected boolean potion = false;
   protected boolean hiding = false;
   protected Dice die = new Dice();
   
   // Constructor of character with no Name? this shouldn't be used.
   Being()
   {
      Name = "Name needed";
      Hp = 20;
      Str = die.d6() + die.d6() + die.d6();
      Dex = die.d6() + die.d6() + die.d6();
      Int = die.d6() + die.d6() + die.d6();
      Weap = 0;
      Arm = 0;
      active = true;
   }
   
   // Character Constructor with random stats.
   Being(String newName)
   {
      Name = newName;
      Hp = 20;
      Str = die.d6() + die.d6() + die.d6();
      Dex = die.d6() + die.d6() + die.d6();
      Int = die.d6() + die.d6() + die.d6();
      Weap = 0;
      Arm = 0;
      active = true;
   }
   
   // Monster Constructor with random stats.
   Being(String newName, String newDesc)
   {
      Name = newName;
      Desc = newDesc;
      Hp = die.d6D3();
      Str = die.d6D3();
      Dex = die.d6D3();
      Int = die.d6D3();
      Weap = 0;
      Arm = 0;
      active = true;
   }
   
   // Constructor with set stats shouldn't be used for the program either.
   Being(String newName, int Hp, int Str, int Dex, int Int, int Weap, int Arm)
   {
      this.Name = newName;
      this.Hp = Hp;
      this.Str = Str;
      this.Dex = Dex;
      this.Int = Int;
      this.Weap = Weap;
      this.Arm = Arm;
      active = true;
   }
   
   // Setters and Getters
   String getName()
   {
      return Name;   
   }
   
   int getHp()
   {
      return Hp;
   }
   
   void setHp(int newHp)
   {
      Hp = newHp;
   }
   
   int getStr()
   {
      return Str;
   }
   
   int getDex()
   {
      return Dex;
   }
   
   int getInt()
   {
      return Int;
   }
   
   int getWeap()
   {
      return Weap.getWeap();
   }
   
   int getArm()
   {
      return Arm.getArmor();
   }
   
   boolean getActive()
   {
      return active;
   }
   
   void setActive()
   {
      active = true;
   }
   
   void setDeactive()
   {
      active = false;
   }
   
   void setSpell(int newspell)
   {
      Spell = newspell;
   }
   
   int useSpell()
   {
      int temp = Spell;
      Spell = 0;      
      return temp;
   }
   
   boolean hasSpell()
   {
      boolean result = false;
      if (this.Spell > 0)
      {
         result = true;
      }
      
      return result;
   }
   
   void setWar()
   {
      profession = "Warrior";
      Str = Str + 1;
      Int = Int - 1;
      Hp = Hp + 1;
   }
   
   void setWiz()
   {
      profession = "Wizard";
      Int = Int + 1;
      Hp = Hp - 1;
      Str = Str - 1;
   }
   
   void setThf()
   {
      profession = "Thief";
      Dex = Dex + 1;
      Str = Str - 1;
      Int = Int + 1;
   }
   
   void setHide()
   {
      hiding = true;
   }
   
   boolean getHide()
   {
      boolean result = hiding;
      hiding = false;
      return result;
   }
   
   void setPotion()
   {
      potion = true;
   }
   
   boolean getPotion()
   {
      return potion;
   }
   
   void useArmor()
   {
      Arm.itemUsed();
   }
   
   void useWeap()
   {
      Weap.itemUsed();
   }
   
   String tooString()
   {
      return Name + "'s Hp: " + Hp + " Weapon: " + Weap + " Armor: " + Arm
         + " Str: "  + Str + " Dexterity: " + Dex + " Intelligence: "
          + Int + " Class: " + profession + " Alive: " + active;
   }
}

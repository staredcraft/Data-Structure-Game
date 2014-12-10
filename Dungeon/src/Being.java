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
   protected String action;
   protected Being target;
   
   // Constructor of character with no Name? this shouldn't be used.
   Being()
   {
      Name = "Name needed";
      Hp = 20;
      Str = die.d6() + die.d6() + die.d6();
      Dex = die.d6() + die.d6() + die.d6();
      Int = die.d6() + die.d6() + die.d6();
      Weap = null;
      Arm = null;
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
      Weap = new Item();
      Arm = new Item();
      active = true;
   }
   
   // Monster Constructor with random stats.
   Being(String newName, String newDesc)
   {
      Name = "Bandit";
      Desc = newDesc;
      Hp = die.d6D3();
      Str = die.d6D3();
      Dex = die.d6D3();
      Int = die.d6D3();
      Weap = null;
      Arm = null;
      active = true;
   }
   
   // Constructor with set stats shouldn't be used for the program either.
   Being(String newName, int Hp, int Str, int Dex, int Int, Item Weap, Item Arm)
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

   String getProfession() 
   {
      return profession;
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
   
   int getWeapon()
   {
      return Weap.getWeapon();
   }
   
   String getWeaponName()
   {
       switch(Weap.getWeapon()){
           case 0: 
               return "Fists";
           case 1:
               return "Dagger";
           case 2:
               return "Short Sword";
           case 3:
               return "Long Sword";
           default:
               return "No Weapon";
       }
   }
   
   String getArmorName()
   {
       switch(Arm.getArmor()){
           case 0: 
               return "Clothes";
           case 1:
               return "Leather";
           case 2:
               return "Chainmail";
           case 3:
               return "Platemail";
           default:
               return "No Armor";
       }
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
   
   void addPotion()
   {
      potion = true;
   }
    
   void removePotion()
   {
       potion = false;
   }
   
   boolean hasPotion()
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
   
   void heal(int healAmount)
   {
        setHp(Hp + healAmount);
        if(Hp > 20)
        {
            Hp = 20;
        }
   }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Being getTarget() {
        return target;
    }

    public void setTarget(Being target) {
        this.target = target;
    }
   
   
   
   String tooString()
   {
      return Name + "'s Hp: " + Hp + " Weapon: " + Weap + " Armor: " + Arm
         + " Str: "  + Str + " Dexterity: " + Dex + " Intelligence: "
          + Int + " Class: " + profession + " Alive: " + active;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author infodba
 */
public class CharacterClass {
    
    protected String PlayerName;
    protected String description;
    protected String inventoryArmor;
    protected String inventoryWeapon;
    protected int inventoryPotions;
    protected int Strength;
    protected int Dexterity;
    protected int Intelligence;
    protected int HP;
    protected int Armor;
    protected int Weapon;
    
    public CharacterClass(String PlayerName, String description, String inventoryWeapon,
            String inventoryArmor, int HP, int Strength, int Dexterity, int Intelligence, 
            int inventoryPotions)
    {
        this.PlayerName = PlayerName;
        this.description = description;
        this.HP = HP;
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Intelligence = Intelligence;
        this.inventoryPotions = inventoryPotions;
        this.inventoryWeapon = inventoryWeapon;
        this.inventoryArmor = inventoryArmor;
     }   

    @Override
    public String toString() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return "Hero HP: " + hitPoints;
    }


    public boolean isAlive() {
        return hitPoints > 0;
    }
    
    public boolean hasPotion(){
      return inventoryPotions == 1;
    }
    
    public boolean useFist(){
      return Weapon == 0;
    }
    
    public WarriorClass()
    {
    PlayerName = "Warrior";
    description = "";
    HP = 1;
    Strength = 1;
    Dexterity = 1;
    Intellegence = 1;
    inventoryPotions = 0;
    inventoryWeapons = 0;
    inventoryArmor = 0;
    }
    
    public WizardClass ()
   {
    PlayerName = "Wizard";
    description = "";
    HP = 1;
    Strength = 1;
    Dexterity = 1;
    Intellegence = 1;
    inventoryPotions = 0;
    inventoryWeapons = 0;
    inventoryArmor = 0;   }
   
   public ThiefClass ()
   {
    PlayerName = "Thief";
    description = "";
    HP = 1;
    Strength = 1;
    Dexterity = 1;
    Intellegence = 1;
    inventoryPotions = 0;
    inventoryWeapons = 0;
    inventoryArmor = 0;   }
    
   
   public boolean useSword()
   {
      return Weapon == 1;

   }
   public boolean useHammer()
   {
      return Weapon == 2;

   }
   public boolean useMace()
   {
      return Weapon == 3;

   }
   public boolean useStaff()
   {
      return Weapon == 4;

   }
   public boolean useDagger()
   {
      return Weapon == 5;

   }
   public boolean useChainmail()
   {
      return Armor == 1;

   }
   public boolean useNaked()
   {
      return Armor == 0;

   }
   
   public boolean useSteel()
   {
      return Armor == 3;

   }
   public boolean useGold()
   {
      return Armor == 4;

   }
   public boolean useIron()
   {
      return Armor == 5;

   }
    
}

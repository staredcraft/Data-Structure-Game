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
public class WeaponClass {
    
    protected String WeaponName;
    protected String description;
    protected int attackDamage;
    protected int weaponDegrade;
    protected int armorDegrade;
    protected int armorProtection;

    
    public WeaponClass(String WeaponName, String description, int attackDamage, int weaponDegrade, int armorDegrade, int armorProtection)
    {
        this.PlayerName = WeaponName;
        this.description = description;
        this.attackDamage = attackDamage;
        this.weaponDegrade = weaponDegrade;
        this.armorDegrade = armorDegrade;
        this.armorProtection = armorProtection;
     }   

    @Override
    public String toString() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public Sword()
    {
    PlayerName = "Sword";
    description = "";
    attackDamage = 3;
    weaponDegrade = 10;
    }
    
    public Hammer()
    {
    PlayerName = "Hammer";
    description = "";
    attackDamage = 5;
    weaponDegrade = 10;
    }
   
    public Mace()
    {
    PlayerName = "Mace";
    description = "";
    attackDamage = 7;
    weaponDegrade = 10;
    }
    
    public Staff()
    {
    PlayerName = "Staff";
    description = "";
    attackDamage = 4;
    weaponDegrade = 10;
    }
    

    public Dagger()
    {
    PlayerName = "Dagger";
    description = "";
    attackDamage = 6;
    weaponDegrade = 10;
    }
    
    public Chainmail()
    {
    PlayerName = "Chainmail";
    description = "";
    armorProtection = 3;
    armorDegrade = 10;
    }
    public Naked()
    {
    PlayerName = "Naked";
    description = "";
    armorProtection = 0;
    armorDegrade = 0;
    }
   
    public Steel()
    {
    PlayerName = "Steel";
    description = "";
    armorProtection = 5;
    armorDegrade = 10;
    }
    public Gold()
    {
    PlayerName = "Chainmail";
    description = "";
    armorProtection = 7;
    armorDegrade = 10;
    }
    public Iron()
    {
    PlayerName = "Iron";
    description = "";
    armorProtection = 6;
    armorDegrade = 10;
    }
    
}

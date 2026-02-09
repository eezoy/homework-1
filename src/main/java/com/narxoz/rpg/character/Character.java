package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
/**
 * Base interface for all character types in the RPG system.
 *
 * TODO: Decide if this should be an interface or abstract class
 * Think: What's common to ALL characters?
 * Think: What varies between character types?
 *
 * Factory Method Pattern:
 * This represents the "Product" in the Factory Method pattern.
 * Different character classes (Warrior, Mage, Archer) are concrete products.
 */
public abstract class Character {
    protected String name;
    protected int health;
    protected int mana; 
    protected int strength;
    protected int intelligence;
    protected CharacterType type;

    public String getName(){
        return name;
    };
    // - int getHealth()
    public int getHealth(){
        return health;
    };
    // - int getMana()
    public int getMana(){
        return mana;
    };
    // - int getStrength()
    public int getStrength(){
        return strength;
    };
    // - int getIntelligence()
    public int getIntelligence(){
        return intelligence;
    };
    // - void displayStats()
    public abstract void displayStats();
    // - void useSpecialAbility()
    public abstract void useSpecialAbility();
    // constructor
    public Character(String name) {
        this.name = name;
    }
    // getter for type
    public CharacterType getType() {
        return type;
    }

    // TODO: Think about equipment
    private Weapon equippedWeapon;
    private Armor equippedArmor;
    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
        System.out.println(name + " equipped " + weapon.getName());
    }

    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
        System.out.println(name + " equipped " + armor.getName());
    }
    public void displayEquipment() {
        System.out.println("Equipped Weapon: " + equippedWeapon.getName());
        System.out.println("Equipped Armor: " + equippedArmor.getName());
    }

    // TODO: Define common character behaviors
    // Consider methods like:
    // - String getName()
    // - int getHealth()
    // - int getMana()
    // - int getStrength()
    // - int getIntelligence()
    // - void displayStats()
    // - void useSpecialAbility()

    // TODO: Think about equipment
    // Should characters know about their equipped items?
    // How will you handle equipping weapons and armor?

}

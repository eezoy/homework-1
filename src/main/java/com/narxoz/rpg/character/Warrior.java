package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

/**
 * Example concrete implementation of a Character.
 *
 * This is provided as a reference to help you get started.
 * Study this implementation, then create similar classes for Mage, Archer, etc.
 *
 * Notice:
 * - How attributes are initialized
 * - How methods are implemented
 * - The structure you should follow for other character types
 *
 * TODO: Create similar implementations for:
 * - Mage (high mana/intelligence, low health/strength)
 * - Archer (balanced stats, ranged combat)
 * - (Optional) Additional classes: Rogue, Paladin, etc.
 */
public class Warrior extends Character {

    // TODO: Add fields for equipped weapon and armor
    // Think: Should Warrior know about its equipment?

    
    public Warrior(String name) {
        super(name);
        // Warrior stats: high health and strength, low mana and intelligence
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
        this.type = CharacterType.WARRIOR;
    }

    // TODO: Implement methods from Character interface
    // You need to define those methods in Character interface first!
    // Example method structure:
    public String getName() {
        return name;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getStrength() {
        return strength;
    }
    @Override
    public int getIntelligence() {
        return intelligence;
    }
        
    // TODO: Add equipment-related methods
    // Examples:
    // - void equipWeapon(Weapon weapon)
    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
        System.out.println(name + " equipped " + weapon.getName());
    }
    // - void equipArmor(Armor armor)
    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
        System.out.println(name + " equipped " + armor.getName());
    }
    // - void displayEquipment()
    public void displayEquipment() {
        System.out.println("Equipped Weapon: " + equippedWeapon.getName());
        System.out.println("Equipped Armor: " + equippedArmor.getName());
    }
}
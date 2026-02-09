package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer extends Character {
    private Weapon equippedWeapon;
    private Armor equippedArmor;
    public Archer(String name) {
        super(name);
        this.health = 120;
        this.mana = 80;
        this.strength = 40;
        this.intelligence = 30;
        this.type = CharacterType.ARCHER;
    }
    public String getName() {
        return name;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses ARCHER RAIN OF ARROWS! Strength temporarily increased!");
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
}
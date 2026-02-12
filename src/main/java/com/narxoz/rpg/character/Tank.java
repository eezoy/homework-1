package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Tank extends Character {
    public Tank(String name) {
        super(name);
        this.health = 200;
        this.mana = 20;
        this.strength = 60;
        this.intelligence = 20;
        this.type = CharacterType.TANK;
    }

    public String getName() {
        return name;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Tank) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses TANK STANCE! Health temporarily increased!");
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
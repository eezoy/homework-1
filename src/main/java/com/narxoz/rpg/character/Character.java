package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public abstract class Character {
    protected String name;
    protected int health;
    protected int mana; 
    protected int strength;
    protected int intelligence;
    protected CharacterType type;

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getMana(){
        return mana;
    }

    public int getStrength(){
        return strength;
    }

    public int getIntelligence(){
        return intelligence;
    }

    public abstract void displayStats();
    public abstract void useSpecialAbility();

    public Character(String name) {
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    protected Weapon equippedWeapon;
    protected Armor equippedArmor;

    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
        System.out.println(name + " equipped " + weapon.getName());
    }

    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
        System.out.println(name + " equipped " + armor.getName());
    }

    public void displayWeaponStats(){
        if (equippedWeapon != null) { 
        System.out.println("Weapon: " + equippedWeapon.getName());
        System.out.println("Damage: " + equippedWeapon.getDamage());
        System.out.println("Type: " + equippedWeapon.getWeaponType());
        System.out.println("Effect: " + equippedWeapon.getEffect());}
        else {
        System.out.println(name + " has no weapon equipped.");}
    }
    public void displayArmorStats(){
        if(equippedArmor != null) {
        System.out.println("Armor: " + equippedArmor.getName());
        System.out.println("Protection: " + equippedArmor.getDefense());
        System.out.println("Type: " + equippedArmor.getArmorType());
        System.out.println("Effect: " + equippedArmor.getEffect());
        }
        
        else {
        System.out.println(name + " has no armor equipped.");
        }
    }
}

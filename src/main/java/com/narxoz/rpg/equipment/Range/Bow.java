package com.narxoz.rpg.equipment.Range;

import com.narxoz.rpg.equipment.Weapon;

public class Bow implements Weapon{
    private String name;
    private int damage;
    private String weaponType;
    private String effect;

    public Bow(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.weaponType = "Bow";
        this.effect = "Poison";
    }

    public int getDamage() {
        return damage;
    }

    public String getWeaponInfo() {
        return "Bow - is an Archer's dream weapon.";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Effect: " + effect);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public String getEffect() {
        return effect;
    }
    
}

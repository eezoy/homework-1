package com.narxoz.rpg.equipment.Magic;

import com.narxoz.rpg.equipment.Weapon;

public class Staff implements Weapon{
    private String name;
    private int damage;
    private String weaponType;
    private String effect;
    
    public Staff(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.weaponType = "Staff";
        this.effect = "Ignition";
    }

    public int getDamage() {
        return damage;
    }

    public String getWeaponInfo() {
        return "Magic Staff - a powerful weapon for mages";
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

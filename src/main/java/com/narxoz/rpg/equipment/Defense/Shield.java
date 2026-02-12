package com.narxoz.rpg.equipment.Defense;

import com.narxoz.rpg.equipment.Weapon;

public class Shield implements Weapon {
    private String name;
    private int damage;
    private String weaponType;
    private String effect;
    
    public Shield(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.weaponType = "Shield";
        this.effect = "Block";
    }

    public int getDamage() {
        return damage;
    }

    public String getWeaponInfo() {
        return "Shield - a sturdy shield used for blocking attacks";
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

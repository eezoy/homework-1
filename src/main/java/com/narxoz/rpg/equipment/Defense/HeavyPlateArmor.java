package com.narxoz.rpg.equipment.Defense;

import com.narxoz.rpg.equipment.Armor;

public class HeavyPlateArmor implements Armor {
    private String name;
    private int protection;
    private String armorType;
    private String effect;

    public HeavyPlateArmor(String name, int protection) {
        this.name = name;
        this.protection = protection;
        this.armorType = "Heavy Armor";
        this.effect = "Blast Protection";
    }

    public int getProtection() {
        return protection;
    }

    public String getArmorInfo() {
        return "Heavy Plate Armor - heavy armor made of steel plates, providing excellent protection but reducing mobility.";
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Protection: " + protection);
        System.out.println("Type: " + armorType);
        System.out.println("Effect: " + effect);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public String getEffect() {
        return effect;
    }

    @Override
    public int getDefense() {
        return protection;
    }
}

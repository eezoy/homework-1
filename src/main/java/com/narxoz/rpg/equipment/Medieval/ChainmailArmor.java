package com.narxoz.rpg.equipment.Medieval;

import com.narxoz.rpg.equipment.Armor;

public class ChainmailArmor implements Armor {
    private String name;
    private int protection;
    private String armorType;
    private String effect;

    public ChainmailArmor(String name, int protection) {
        this.name = name;
        this.protection = protection;
        this.armorType = "Heavy Armor";
        this.effect = "Thorns";
    }

    public int getProtection() {
        return protection;
    }

    public String getArmorInfo() {
        return "Chainmail Armor - heavy armor made of interlocking metal rings";
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

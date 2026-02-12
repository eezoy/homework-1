package com.narxoz.rpg.abstract_factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Medieval.IronSword;
import com.narxoz.rpg.equipment.Medieval.ChainmailArmor;

public class WarriorSet implements SetFactory {
    @Override
    public Weapon createWeapon(String name, int damage) {
        return new IronSword(name, damage); 
    }

    @Override
    public Armor createArmor(String name, int protection) {
        return new ChainmailArmor(name, protection);
    }                                                           
}


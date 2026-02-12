package com.narxoz.rpg.abstract_factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Range.Bow;
import com.narxoz.rpg.equipment.Range.LightArmor;

public class ArcherSet implements SetFactory {
    @Override
    public Weapon createWeapon(String name, int damage) {
        return new Bow(name, damage); 
    }

    @Override
    public Armor createArmor(String name, int protection) {
        return new LightArmor(name, protection);
    }
}

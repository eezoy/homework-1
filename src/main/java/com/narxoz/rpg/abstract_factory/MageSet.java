package com.narxoz.rpg.abstract_factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Magic.Staff;
import com.narxoz.rpg.equipment.Magic.MageRobe;

public class MageSet implements SetFactory {
    @Override
    public Weapon createWeapon(String name, int damage) {
        return new Staff(name, damage); 
    }

    @Override
    public Armor createArmor(String name, int protection) {
        return new MageRobe(name, protection);
    }
}

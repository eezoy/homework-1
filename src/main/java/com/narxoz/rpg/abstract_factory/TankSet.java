package com.narxoz.rpg.abstract_factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Defense.Shield;
import com.narxoz.rpg.equipment.Defense.HeavyPlateArmor;

public class TankSet implements SetFactory {
    @Override
    public Weapon createWeapon(String name, int damage) {
        return new Shield(name, damage); 
    }

    @Override
    public Armor createArmor(String name, int protection) {
        return new HeavyPlateArmor(name, protection);
    }                                                           

}

package com.narxoz.rpg.abstract_factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public interface SetFactory {
    Weapon createWeapon(String name, int damage);
    Armor createArmor(String name, int protection);
}


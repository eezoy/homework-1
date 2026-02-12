package com.narxoz.rpg;

import com.narxoz.rpg.abstract_factory.ArcherSet;
import com.narxoz.rpg.abstract_factory.MageSet;
import com.narxoz.rpg.abstract_factory.SetFactory;
import com.narxoz.rpg.abstract_factory.WarriorSet;
import com.narxoz.rpg.abstract_factory.TankSet;
import com.narxoz.rpg.character.*;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory_method.CharacterFactoryRegistry;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        CharacterFactoryRegistry registry = new CharacterFactoryRegistry();
        Character warrior = registry.getFactory(CharacterType.WARRIOR).CharacterFabric("Achilles");
        Character mage = registry.getFactory(CharacterType.MAGE).CharacterFabric("Severus Snape");
        Character archer = registry.getFactory(CharacterType.ARCHER).CharacterFabric("Neytiri");
        Character tank = registry.getFactory(CharacterType.TANK).CharacterFabric("Reinhardt");
        System.out.println(" ");
        
        SetFactory warriorFactory = new WarriorSet();
        SetFactory mageFactory = new MageSet();
        SetFactory archerFactory = new ArcherSet();
        SetFactory tankFactory = new TankSet(); 

        warrior.equipWeapon(warriorFactory.createWeapon("Xiphos", 52));
        warrior.equipArmor(warriorFactory.createArmor("Heavy Plate", 100));
        System.out.println();
        mage.equipWeapon(mageFactory.createWeapon("Elder Wand", 69));
        mage.equipArmor(mageFactory.createArmor("Enchanted Robe", 75));
        System.out.println();
        archer.equipWeapon(archerFactory.createWeapon("Longbow", 45));
        archer.equipArmor(archerFactory.createArmor("Leather Armor", 60));
        System.out.println();
        tank.equipWeapon(tankFactory.createWeapon("Reinhardt's Shield", 35));
        tank.equipArmor(tankFactory.createArmor("Heavy Plate", 100));
        System.out.println();

        warrior.displayWeaponStats();
        System.out.println();
        mage.displayWeaponStats();
        System.out.println();
        archer.displayWeaponStats();
        System.out.println();
        tank.displayWeaponStats();
        System.out.println();
        warrior.displayArmorStats();
        System.out.println();
        mage.displayArmorStats();
        System.out.println();
        archer.displayArmorStats();
        System.out.println();
        tank.displayArmorStats();
        System.out.println();
        warrior.displayStats();
        System.out.println();
        mage.displayStats();
        System.out.println();
        archer.displayStats();
        System.out.println();
        tank.displayStats();
        System.out.println();
    }
}
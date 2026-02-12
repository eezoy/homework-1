package com.narxoz.rpg.factory_method;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Warrior;

public class WarriorCharacterFactory extends CharacterFactory {
    @Override
    protected Character createCharacter(String name) {
        return new Warrior(name);
    }
}
package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Mage;

public class MageCharacterFactory extends CharacterFactory {
    @Override
    protected Character createCharacter(String name) {
        return new Mage(name);
    }
}
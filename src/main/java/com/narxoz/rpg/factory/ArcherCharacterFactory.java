package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Character;

public class ArcherCharacterFactory extends CharacterFactory {
    @Override
    protected Character createCharacter(String name) {
        return new Archer(name);
    }
}
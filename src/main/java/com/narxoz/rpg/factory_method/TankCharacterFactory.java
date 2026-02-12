package com.narxoz.rpg.factory_method;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Tank;

public class TankCharacterFactory extends CharacterFactory {
    @Override
    protected Character createCharacter(String name) {
        return new Tank(name);
    }   
}

package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterFactory {
    protected abstract Character createCharacter(String name);

    public Character CharacterFabric(String name){
        Character character = createCharacter(name);
        System.out.println("The new character is: " + character.getName());
        return character;
    }
}
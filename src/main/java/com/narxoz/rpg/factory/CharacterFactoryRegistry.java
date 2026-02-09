package com.narxoz.rpg.factory;

import java.util.*;

import com.narxoz.rpg.character.CharacterType;

public class CharacterFactoryRegistry {
    private final Map<CharacterType, CharacterFactory> creators = new HashMap<>();

    public CharacterFactoryRegistry() {
        creators.put(CharacterType.WARRIOR, new WarriorCharacterFactory());
        creators.put(CharacterType.MAGE, new MageCharacterFactory());
        creators.put(CharacterType.ARCHER, new ArcherCharacterFactory());
    }

    public CharacterFactory getFactory(CharacterType type) {
        if (!creators.containsKey(type)) {
            throw new IllegalArgumentException("Type of character '" + type + "' is not supported.");
        }
        return creators.get(type);
    }
}
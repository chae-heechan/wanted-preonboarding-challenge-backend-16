package com.wanted.preonboarding.character.character;

import com.wanted.preonboarding.character.behavior.KnifeBehavior;

public class Knight extends Character {
    @Override
    public void fight() {
        setWeapon(new KnifeBehavior());
        weapon.attack();
    }
}

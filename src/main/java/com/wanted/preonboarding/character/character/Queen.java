package com.wanted.preonboarding.character.character;

import com.wanted.preonboarding.character.behavior.BowAndArrowBehavior;

public class Queen extends Character {
    @Override
    public void fight() {
        setWeapon(new BowAndArrowBehavior());
        weapon.attack();
    }
}

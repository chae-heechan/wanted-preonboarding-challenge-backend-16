package com.wanted.preonboarding.character.character;

import com.wanted.preonboarding.character.behavior.SwordBehavior;

public class King extends Character {
    @Override
    public void fight() {
        setWeapon(new SwordBehavior());
        weapon.attack();
    }
}

package com.wanted.preonboarding.character.character;

import com.wanted.preonboarding.character.behavior.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weaponBehavior) {

    }
}

package com.shatteredpixel.shatteredpixeldungeon.actors.hero.abilities.tengu;

import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Hero;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Talent;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.abilities.ArmorAbility;
import com.shatteredpixel.shatteredpixeldungeon.items.armor.ClassArmor;

public class TenguBombs extends ArmorAbility {
    @Override
    protected void activate(ClassArmor armor, Hero hero, Integer target) {

    }

    @Override
    public Talent[] talents() {
        return new Talent[0];
    }
}

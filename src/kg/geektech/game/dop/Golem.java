package kg.geektech.game.dop;

import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class Golem extends Hero {
    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.GOLEM, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setDamage(boss.getDamage() - boss.getDamage() / 5);
        this.setDamage(this.getDamage() - heroes.length * 10);
    }
}

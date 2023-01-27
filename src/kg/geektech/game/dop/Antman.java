package kg.geektech.game.dop;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class Antman extends Hero {
    public Antman(int health, int damage, String name) {
        super(health, damage, SuperAbility.ANTMAN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean chick = RPG_Game.random.nextBoolean();
        if (chick) {
            this.setHealth(this.getHealth() + 100);
            this.setDamage(this.getDamage() + 10);
            System.out.println("Antman Увеличил себя на [50%]");
        } else {
            this.setDamage(this.getDamage() - 10);
            this.setHealth(this.getHealth() - 100);
            System.out.println("Antman уменьшил себя на [50%]");
        }
    }
}

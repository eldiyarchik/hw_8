package kg.geektech.game.dop;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class Deku extends Hero {
    public Deku(int health, int damage, String name) {
        super(health, damage, SuperAbility.DEKU, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean chick = RPG_Game.random.nextBoolean();
        if (chick) {
            this.setDamage(this.getDamage() + this.getDamage());
            this.setHealth(this.getHealth() - 100);
            System.out.println("Deku теряет 100хп, но урон повышается на 100%");
        } else {
            this.setDamage(this.getDamage() + this.getDamage() / 2);
            this.setHealth(this.getHealth() - 50);
            System.out.println("Deku теряет 50хп, но урон повышается на 50%");
        }
    }
}

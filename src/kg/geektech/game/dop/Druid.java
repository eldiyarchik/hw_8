package kg.geektech.game.dop;

import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class Druid extends Hero {
    private static boolean chick = true;
    public Druid(int health, int damage, String name) {
        super(health, damage, SuperAbility.PRIZYV_ANGEL_AND_VORON, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getHealth() < 350 && chick == true) {
            boss.setDamage(boss.getDamage() * 2);
            System.out.println("Друид призвал боссу Ворона, а ворон увеличил урон босса на: [" + boss.getDamage() + "] единиц!");
            chick = false;
        }
    }
}

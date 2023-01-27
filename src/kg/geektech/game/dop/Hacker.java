package kg.geektech.game.dop;

import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

import static kg.geektech.game.general.RPG_Game.random;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.HACKER, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean round = random.nextBoolean();
        int hackerring = 100;
        for (int i = 0; i < heroes.length; i++) {
            if (round == true && heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - hackerring);
                i = random.nextInt(heroes.length);
                heroes[i].setHealth(heroes[i].getHealth() + hackerring);
                    System.out.println(" Hacker Забрал у Boss [" + hackerring + "] HP и перевел герою: [" + heroes[i].getName() + "]");
                break;
            } else {
                System.out.println("Hacker не захаккерил!");
                break;
            }
        }
    }
}

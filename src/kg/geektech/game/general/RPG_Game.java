package kg.geektech.game.general;

import kg.geektech.game.dop.*;
import kg.geektech.game.players.*;

import java.util.Random;

public class RPG_Game {
    public static int round_number;
    public static Random random = new Random();

    public static void start() {
        Boss boss = new Boss(7000, 50, "Boss");
        Warrior warrior = new Warrior(260, 15, "Varvar");
        Medic doc = new Medic(230, 10, 15, "Aibolit");
        Berserk berserk = new Berserk(270, 20, "Bers");
        Magic magic = new Magic(250, 25, "Antimag");
        Medic assistant = new Medic(270, 15, 5, "Stajer");
        Antman antman = new Antman(200, 25, "Antman");
        Druid druid = new Druid(150, 20, "Druid");
        Hacker hacker = new Hacker(250, 30, "Sharik");
        Witcher witcher = new Witcher(300,25, "Witcher");
        Golem golem = new Golem(800, 5, "Golem");
        Deku deku = new Deku(250, 25, "Deku");
        Aurora aurora = new Aurora(300, 25, "Aurora");
        Hero[] heroes = {warrior, doc, berserk, magic, assistant, antman, druid, hacker, witcher, golem, deku, aurora};
        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }
    }

    private static void round(Boss boss, Hero[] heroes) {
        round_number++;
        boss.hit(heroes);
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].hit(boss);
            heroes[i].applySuperPower(boss, heroes);
        }
        printStatistics(boss, heroes);
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println(round_number + " ROUND _________________");
        System.out.println("Boss health: " + boss.getHealth() + " [" + boss.getDamage() + "]");
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof Medic) {
                System.out.println(heroes[i].getClass().getSimpleName() + " health: " + heroes[i].getHealth() + " [" + heroes[i].getDamage() + "] +" + ((Medic) heroes[i]).getHealPoints() + "+");
            } else {
                System.out.println(heroes[i].getClass().getSimpleName() + " health: " + heroes[i].getHealth() + " [" + heroes[i].getDamage() + "]");
            }
        }
    }
}

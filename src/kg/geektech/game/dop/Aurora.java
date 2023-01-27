package kg.geektech.game.dop;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class Aurora extends Hero {
    public Aurora(int health, int damage, String name) {
        super(health, damage, SuperAbility.AURORA, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (RPG_Game.round_number == 4 && RPG_Game.round_number == 5){
            this.setHealth(this.getHealth() + boss.getDamage());
            System.out.println("Aurora начинает Ability");
        }else if (RPG_Game.round_number == 6){
            boss.setHealth(boss.getDamage() * 2);
            System.out.println("Aurora завершила супер атаку!!!!!!!");
        }
    }
}

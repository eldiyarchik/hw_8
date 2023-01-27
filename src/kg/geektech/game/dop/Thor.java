package kg.geektech.game.dop;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOSS_CANT_HIT,name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean superOfThorIsTrue = RPG_Game.random.nextBoolean();
        if(superOfThorIsTrue){
            boss.setDamage(0);
            System.out.println("Thor activated SUPER");
        }else if(!(superOfThorIsTrue) ){
            boss.setDamage(boss.getDamage());
        }
    }
}

package kg.geektech.game.dop;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class TrickyBastard extends Hero {
    public TrickyBastard(int health, int damage, String name) {
        super(health, damage, SuperAbility.MAKE_A_JOKE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean randomBoolean = RPG_Game.random.nextBoolean();
        if (randomBoolean){
            this.setHealth(0);
            this.setDamage(0);
            System.out.println("Joker joked");
        }else if(!(randomBoolean)){
            this.setHealth(this.getHealth());
            this.setDamage(this.getDamage());
        }
    }
}

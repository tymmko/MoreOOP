package lotr;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super(new Random().nextInt(13) + 2, new Random().nextInt(13) + 2);
    }

    public void kick(Character whom) {
        Kick nKick = new Kick();
        nKick.kick(this ,whom);
    }
}




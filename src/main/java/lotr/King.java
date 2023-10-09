package lotr;

import java.util.Random;
public class King extends Character{
    public King(){
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
    }

    public void kick(Character whom) {
        Kick nKick = new Kick();
        nKick.kick(this ,whom);

    }
}

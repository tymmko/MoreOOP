package lotr;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }

    public void kick(Character who) {
        Kick elfKick = new Kick();
        elfKick.kick(this, who);
    }
//
}




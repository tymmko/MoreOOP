package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character who) {
        System.out.println("Do not touch me!!!!");
    }
}



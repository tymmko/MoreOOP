package lotr;

//implements BasicKick
public class Kick {

    public void kick(Character who, Character whom) {
        if (who.getPower() > whom.getPower()){
            whom.setHp(0);
        }else{
            who.setHp(whom.getHp()-1);
        }
    }

}

package lotr;

import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @Setter @AllArgsConstructor
public abstract class Character{
    private int hp;
    private int power;

    public void setHp(int number){
        if (number<=0 || getHp()-number <0){
            hp = 0;
        }
    }
    public boolean isAlive(){
        return getHp() > 0;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + this.hp + ", power=" + this.power + "}";
    }

    public abstract void kick(Character who);
}

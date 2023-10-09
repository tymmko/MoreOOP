package lotr;

public class GameManager {
    public void fight(Character one, Character two){
        System.out.println("The first is"  + one.toString());
        System.out.println("The second is"  + two.toString());
        int counter = 1;
        while(one.isAlive() && two.isAlive()){
            System.out.println("The"+ counter +" round of fight");
            System.out.println(one.getClass()+ " hits"+ two.getClass());
            one.kick(two);
            System.out.println("The result is: \n"+one.getHp() + "\n"+ two.getHp());
            System.out.println(two.getClass()+ " hits"+ one.getClass());
            two.kick(one);
            System.out.println("The result is: \n"+one.getHp() + "\n"+ two.getHp());
        }
    }
}

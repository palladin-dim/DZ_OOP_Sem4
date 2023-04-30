package SewingClass;

public class Thief extends Warrior<Knife>{

    public Thief(String name, int hp, Weapon weapon) {
        super(name, hp, (Knife) weapon);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

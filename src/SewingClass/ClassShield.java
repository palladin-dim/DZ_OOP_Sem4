package SewingClass;

public class GlassShield extends Shield{

    public GlassShield() {
        super("Лёкий", 50, 40, 1);
    }


    @Override
    public int protection() {
        if (isIntact()) return 100;
        else return 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}

package SewingClass;

public class SimpleDress implements SafeTool {
    String name = "Костюм ученика";
    int safetyMargin = 100;

    @Override
    public boolean isIntact() {
        return true;
    }

    @Override
    public int protection() {
        return 1;
    }

    @Override
    public int blockVariant() {
        return 1;
    }

    @Override
    public void safetyMarginReduce() {
        this.safetyMargin -= 1;
    }
    @Override
    public int safetyMargin() {
        return safetyMargin;
    }
}

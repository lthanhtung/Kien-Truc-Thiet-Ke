package TutorialFacTori;

public abstract class Pizza {
    StringBuilder stringBuilder = new StringBuilder();
    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}

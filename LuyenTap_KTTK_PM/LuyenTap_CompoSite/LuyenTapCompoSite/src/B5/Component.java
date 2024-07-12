package B5;

public class Component implements IComponent{
    String Ten;

    public Component(String ten) {
        Ten = ten;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public String Show() {
        return this.Ten;
    }
}

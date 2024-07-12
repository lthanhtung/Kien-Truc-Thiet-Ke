package B3;

public class WidgetCreate extends widget{
    String Ten;

    public WidgetCreate(String ten) {
        Ten = ten;
    }

    @Override
    public String show() {
        return this.Ten;
    }
}

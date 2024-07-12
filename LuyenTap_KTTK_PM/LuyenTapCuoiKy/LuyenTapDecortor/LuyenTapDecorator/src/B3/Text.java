package B3;

public class Text extends WidgetDecorator{
    String Ten;

    public Text(B3.widget widget, String ten) {
        super(widget);
        Ten = ten;
    }

    @Override
    public String show() {
        return super.show() + this.Ten;
    }
}

package B3;

public class Icon extends WidgetDecorator{
    String ten;

    public Icon(B3.widget widget, String ten) {
        super(widget);
        this.ten = ten;
    }

    @Override
    public String show() {
        return super.show() + this.ten;
    }

}

package B3;

public class WidgetDecorator extends widget{
    widget widget;

    public WidgetDecorator(B3.widget widget) {
        this.widget = widget;
    }

    @Override
    public String show() {
        return widget.show()+"+";
    }
}

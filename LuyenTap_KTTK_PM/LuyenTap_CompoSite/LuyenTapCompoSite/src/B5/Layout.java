package B5;

import java.util.ArrayList;
import java.util.List;

public class Layout implements IComponent {
    String ten;
    List<Component> ThanhPhan = new ArrayList<>();
    public Layout(String ten) {
        this.ten = ten;
    }

    @Override
    public void add(Component component) {
        ThanhPhan.add(component);
    }

    @Override
    public void remove(Component component) {
        ThanhPhan.remove(component);
    }

    @Override
    public String Show() {

        StringBuilder builder = new StringBuilder();
        builder.append(this.ten).append("\n").append("Cac thanh phan giao dien:").append("\n");
        for (var i: ThanhPhan)
        {

            builder.append(i.Ten).append("\n");
        }
        return builder.toString();
    }
}

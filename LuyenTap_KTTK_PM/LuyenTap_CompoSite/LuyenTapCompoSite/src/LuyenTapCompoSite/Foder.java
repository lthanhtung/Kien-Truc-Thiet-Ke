package LuyenTapCompoSite;
//Đây là composite

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Foder extends Component  {
    List<Component> childrent = new ArrayList<>();

    public Foder(String ten, String ngaytao) {
        super(ten, ngaytao);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.ten);

        for (var i:childrent)
        {
            i.p = this.p + "\t";
            stringBuilder.append("\n").append(i.p).append(i.getStringTreeFolder());
            i.p ="";
        }
        return stringBuilder.toString();
    }

    @Override
    public void addItem(Component file) {
        childrent.add(file);
        file.duongdan = this.duongdan+ "\\" + file.ten;
    }

    @Override
    public void removeItem(Component file) {
        childrent.remove(file);

    }
}

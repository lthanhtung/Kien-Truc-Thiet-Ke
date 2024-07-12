package Structural_pattern.Composite_pattern.Vidu_Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Abstractfile {
    List<Abstractfile> children = new ArrayList<>();

    public Folder(String ten, String ngaytao) {
        super(ten, ngaytao);
    }

    @Override
    public void add(Abstractfile f) {
        children.add(f);
        f.duongdan = this.duongdan+ "\\" + f.ten;
    }

    @Override
    public void remove(Abstractfile f) {
        children.remove(f);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten);
        for (var f: children)
        {
            f.p = this.p +"\t";
         builder.append("\n").append(f.p).append(f.getStringTreeFolder());
           f.p ="";
        }
        return builder.toString();
    }

}

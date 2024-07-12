package Structural_pattern.Composite_pattern.Vidu_Composite;

public class File extends  Abstractfile{
    public File(String ten, String ngaytao) {
        super(ten, ngaytao);
    }

    @Override
    public void add(Abstractfile f) {

    }

    @Override
    public void remove(Abstractfile f) {

    }

    @Override
    public String getStringTreeFolder() {
        return this.ten;
    }

    @Override
    public String getPath() {
        return super.getPath();
    }
}

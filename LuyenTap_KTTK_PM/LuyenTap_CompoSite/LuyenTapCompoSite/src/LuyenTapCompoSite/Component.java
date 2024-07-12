package LuyenTapCompoSite;

public abstract class Component {
    //Thuoc tinh chung cho ca 2 file va foder
    String ten,ngaytao,duongdan;
    String p="";
    //Ham thiet lap

    public Component(String ten, String ngaytao) {
        this.ten = ten;
        this.ngaytao = ngaytao;
        this.duongdan = ten;
    }

    public abstract String getStringTreeFolder();
    public abstract void addItem(Component file);
    public abstract void removeItem(Component file);
    public String getPath()
    {
        return duongdan;
    }

}

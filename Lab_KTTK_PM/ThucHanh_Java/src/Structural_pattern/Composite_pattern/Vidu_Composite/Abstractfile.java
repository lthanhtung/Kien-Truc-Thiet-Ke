package Structural_pattern.Composite_pattern.Vidu_Composite;

public abstract class Abstractfile {
    //Các thuộc tín chung cho tất cả thành phần
    String ten, ngaytao, duongdan;
    String p="";
    public Abstractfile(String ten, String ngaytao) {
        this.ten = ten;
        this.ngaytao = ngaytao;
        this.duongdan = ten;
    }
    public abstract void add(Abstractfile f);
    public abstract void remove(Abstractfile f);
    public  abstract String getStringTreeFolder();
    public String getPath(){
        return duongdan;
    }


}

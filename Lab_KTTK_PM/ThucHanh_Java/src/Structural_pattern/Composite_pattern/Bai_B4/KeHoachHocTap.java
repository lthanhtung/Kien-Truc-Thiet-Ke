package Structural_pattern.Composite_pattern.Bai_B4;

public abstract class KeHoachHocTap {

    String ten; //thuoc tin chung
    String p="";

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    public abstract void add(KeHoachHocTap k);
    public abstract void remove(KeHoachHocTap k);
    public abstract String getChuongTrinhDaoTao();
    public abstract int SoTc();
    public abstract int HocPhi();

}

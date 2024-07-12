package Structural_pattern.Composite_pattern.Bai_B4;

public class MonHoc extends KeHoachHocTap {
    int SoTC, hp;

    public MonHoc(String ten, int soTC, int hp) {
        super(ten);
        SoTC = soTC;
        this.hp = hp;
    }

    @Override
    public void add(KeHoachHocTap k) {

    }

    @Override
    public void remove(KeHoachHocTap k) {

    }

    @Override
    public String getChuongTrinhDaoTao() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten)
                .append(";\t")
                .append("So tin chi:").append(SoTc())
                .append(";\t").append("Hoc Phi:").append(HocPhi());
        return builder.toString();
    }

    @Override
    public int SoTc() {
        return this.SoTC;
    }

    @Override
    public int HocPhi() {
        return hp*SoTC;
    }
}

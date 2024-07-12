package Structural_pattern.Composite_pattern.Bai_B4;

import java.util.ArrayList;
import java.util.List;

public class HocMai extends KeHoachHocTap {
    List<KeHoachHocTap> list = new ArrayList<>();

    public HocMai(String ten) {
        super(ten);
    }

    @Override
    public void add(KeHoachHocTap k) {
        list.add(k);


    }

    @Override
    public void remove(KeHoachHocTap k) {
        list.remove(k);
    }

    @Override
    public String getChuongTrinhDaoTao() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten)
                .append(";\t")
                .append("So tin chi:").append(SoTc())
                .append(";\t").append("Hoc Phi:").append(HocPhi());

        for (var f: list)
        {
            f.p = this.p +"\t";
            builder.append("\n").append(f).append(f.getChuongTrinhDaoTao());
            f.p ="";
        }
        return builder.toString();
    }

    @Override
    public int SoTc() {
        int soTc = 0;
        int tong =0;
        for (var i:list)
        {
           tong =soTc + this.SoTc();
        }
        return tong;
    }

    @Override
    public int HocPhi() {
        int tongHP = 0;
        for (var i:list)
        {
        tongHP = tongHP + i.HocPhi();
        }

        return tongHP;
    }
}

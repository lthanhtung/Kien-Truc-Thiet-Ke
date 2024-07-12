package behavioral_pattern.Chain_of_Responsibility.CB1_a;

public class MenhGiaThapNhat extends ATM_TheoMenhGia{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia keTiep(ATM_TheoMenhGia k) {
        return null;
    }

    @Override
    public void rutTien(int SoTien) {
        int Soto = SoTien / menhGia;
        System.out.println("Mệnh giá:" + menhGia + "\nSố tờ:" + Soto);
    }
}

package behavioral_pattern.Chain_of_Responsibility.CB1_b;

public class MenhGia extends ATM_TheoMenhGia {

    ATM_TheoMenhGia KeTiep;
    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia keTiep(ATM_TheoMenhGia k) {
        KeTiep = k;
        return KeTiep;
    }

    @Override
    public void rutTien(int SoTien) {
        int Soto = SoTien/menhGia;
        int SoDu = SoTien%menhGia;
        if (Soto > 0) System.out.println("Mệnh giá:" + this.menhGia + "\nSố tờ:" + Soto);
        if (SoDu > 0) KeTiep.rutTien(SoDu);


    }
}

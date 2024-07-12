package behavioral_pattern.Chain_of_Responsibility.CB1_a;

public abstract class ATM_TheoMenhGia {
    int menhGia;

    public ATM_TheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }
    public abstract ATM_TheoMenhGia keTiep(ATM_TheoMenhGia k);
    public abstract void rutTien(int SoTien);

}

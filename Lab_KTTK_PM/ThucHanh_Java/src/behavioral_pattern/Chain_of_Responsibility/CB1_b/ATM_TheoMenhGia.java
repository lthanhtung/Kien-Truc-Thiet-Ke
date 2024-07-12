package behavioral_pattern.Chain_of_Responsibility.CB1_b;

public abstract class ATM_TheoMenhGia {
    int menhGia;

    public ATM_TheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }
    public abstract ATM_TheoMenhGia keTiep(ATM_TheoMenhGia k);
    public  void rutTien(int SoTien){


    }

}

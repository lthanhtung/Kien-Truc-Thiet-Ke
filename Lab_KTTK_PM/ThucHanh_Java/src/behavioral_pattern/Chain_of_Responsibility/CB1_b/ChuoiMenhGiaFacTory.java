package behavioral_pattern.Chain_of_Responsibility.CB1_b;

import behavioral_pattern.Chain_of_Responsibility.CB1_a.ATM_TheoMenhGia;

public abstract class ChuoiMenhGiaFacTory{
    public abstract ATM_TheoMenhGia getChuoiMenhGia(int menhGia);
    public void rutTien(int SoTien,int menhGiaCaoNhat)
    {
        getChuoiMenhGia(SoTien).rutTien(menhGiaCaoNhat);

    }

}

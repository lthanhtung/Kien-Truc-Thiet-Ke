package behavioral_pattern.Chain_of_Responsibility.CB1_b;

import behavioral_pattern.Chain_of_Responsibility.CB1_a.ATM_TheoMenhGia;
import behavioral_pattern.Chain_of_Responsibility.CB1_a.MenhGia;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFacTory{

    ATM_TheoMenhGia m500;
    ATM_TheoMenhGia m100;

    public ChuoiMenhGiaVND() {
        m500 = new MenhGia(500);
        m100 = new MenhGia(100);
        m500.keTiep(m100);
    }

    @Override
    public ATM_TheoMenhGia getChuoiMenhGia(int menhGia) {
        switch (menhGia)
        {
            case 500: return m500;
            case 100: return m100;
        }
        return null;
    }

    @Override
    public void rutTien(int SoTien, int menhGiaCaoNhat) {

    }
}

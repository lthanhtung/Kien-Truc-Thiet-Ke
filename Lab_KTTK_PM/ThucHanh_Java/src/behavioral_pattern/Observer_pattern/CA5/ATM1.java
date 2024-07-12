package behavioral_pattern.Observer_pattern.CA5;

public class ATM1 {
    TaiKhoanATM theATM;
    public void NhanThe(TaiKhoanATM ATM){
        this.theATM = theATM;
    }

    public void TraThe(TaiKhoanATM ATM)
    {
        this.theATM = null;
    }

    public void rutTien(int SoTien){
        if (theATM !=null)
        {
            if (theATM.KiemtraSodu(SoTien) == true)
            {
                theATM.nhanThongBao(SoTien,true);
            }
            else
                theATM.nhanThongBao(SoTien,false);

        }
        else
            System.out.println("Không có thẻ đi làm thẻ rồi quay lại rút");
    }

    public static interface TaiKhoanATM {
        boolean KiemtraSodu(int Sotien);
        void nhanThongBao(int soTienRut, boolean thanhcong);

    }

}

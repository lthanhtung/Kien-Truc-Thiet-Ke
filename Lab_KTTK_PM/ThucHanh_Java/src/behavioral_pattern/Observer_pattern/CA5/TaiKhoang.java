package behavioral_pattern.Observer_pattern.CA5;

public class TaiKhoang implements ATM.atm_obsever {
    String TenTK;
    int Sodu;
    ATM atm;

    public TaiKhoang(String tenTK, int sodu, ATM atm) {
        TenTK = tenTK;
        Sodu = sodu;
        this.atm = atm;
    }

    void duaThevaoATM()
    {
        this.atm.nhanThe(this);
    }
    void rutthe()
    {
        this.atm.traThe(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        return Sodu - soTien >=50;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong){
            System.out.println("Tai Khoan" + TenTK);
            System.out.println("So du ban dau " + Sodu);
            System.out.println("so tien rut" + soTienRut);
            Sodu-=soTienRut;
            System.out.println("So du con lai " + Sodu);
        }else{
            System.out.println("Tai Khoan" + TenTK);
            System.out.println("so tien rut" + soTienRut);
            System.out.println("So Du Khong Du" + Sodu);
        }
    }
}

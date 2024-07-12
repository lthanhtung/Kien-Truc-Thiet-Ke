package CA5;

public class TaiKhoang implements TaiKhoangObserver{
    String TenTK;
    int Sodu;
    int SotienRut;
    ATM a;
    StringBuilder builder = new StringBuilder();

    public TaiKhoang(String tenTK, int sodu, int sotienRut, ATM a) {
        TenTK = tenTK;
        Sodu = sodu;
        SotienRut = sotienRut;
        this.a = a;
    }

    public void DutThe(){
        a.NhanThe(this);
    }
    public void RutThe(){
        a.TraThe(this);
    }

    @Override
    public boolean KiemTraSoDu() {
        if (this.Sodu > a.SotienToiThieu){

            return true;
        }

            return false;

    }

    @Override
    public void nhanThongBao() {
        if (KiemTraSoDu() == true){
            System.out.println(this.TenTK +" có thể rút tiền");
            builder.append("Tên tài khoảng:").append(TenTK).append("\n")
                    .append("Số dư ban đầu:").append(Sodu).append("\n")
                    .append("Số tiền rút:").append(SotienRut).append("\n")
                    .append("Số dư còn lại:").append(Sodu - SotienRut);
            Sodu = Sodu-SotienRut;
            System.out.println(builder);
        }
        if (KiemTraSoDu() == false) {
            System.out.println("Số dư của " + this.TenTK + " không thóa điều kiện rút tiền");
            builder.append("Tên tài khoảng:").append(TenTK).append("\n")
                    .append("Số dư ban đầu:").append(Sodu).append("\n")
                    .append("Số dư thiếu:").append(a.SotienToiThieu - this.Sodu);
            System.out.println(builder);
        }
    }
}

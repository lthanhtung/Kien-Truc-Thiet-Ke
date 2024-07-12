package behavioral_pattern.Observer_pattern.CA5;

public class ATM {
    atm_obsever theATM;
    public  void nhanThe(atm_obsever theATM){
        this.theATM = theATM;
    }
    public void traThe(atm_obsever theATM){
        this.theATM = null;
    }
    public void rutTien(int soTien){
        if(theATM != null){
            if(theATM.kiemTraSoDu(soTien)){
                theATM.nhanThongBao(soTien,true);
            }else{
                theATM.nhanThongBao(soTien,false);
            }
        }else{
            System.out.println("khong co the cut");
        }
    }
    public static interface atm_obsever{
        boolean kiemTraSoDu(int soTien);
        void nhanThongBao(int soTienRut, boolean thanhCong);
    }
}


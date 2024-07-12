package QLSV;

public class MainQLSV {
    public static void main(String[] args) {

        QLSV qlsv = new QLSV();
        qlsv.them(new SinhVien("Luan","2/10/03",8F));
        qlsv.them(new SinhVien("Trang","12/11/03",7.9F));
        qlsv.setSoSanh( new SoSanhTheoDiem()).XapSep();
        qlsv.inDS();

    }
}

package QLSV;

public class SoSanhTheoTen implements ISoSanh<SinhVien> {
    @Override
    public int SoSanh(SinhVien t1, SinhVien t2) {
        return t1.hoTen.compareTo(t2.hoTen);// hàm so sánh chuỗi
    }
}

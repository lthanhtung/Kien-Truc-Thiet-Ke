package QLSV;

public class SoSanhTheoDiem implements ISoSanh<SinhVien> {
    @Override
    public int SoSanh(SinhVien t1,SinhVien t2) {
        if (t1.diemTb > t2.diemTb)  return 1;
        if (t1.diemTb == t2.diemTb) return 0;
        return -1;
    }
}

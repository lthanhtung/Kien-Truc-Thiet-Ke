package Iterator_pattern.vidu;

public class MOnhoc {
    //th2: duyệt tập  có sẵn
    String ten;
    int SoTC;

    public MOnhoc(String ten, int soTC) {
        this.ten = ten;
        SoTC = soTC;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTC() {
        return SoTC;
    }

    public void setSoTC(int soTC) {
        SoTC = soTC;
    }

    @Override
    public String toString() {
        return "MOnhoc{" +
                "ten='" + ten + '\'' +
                ", SoTC=" + SoTC +
                '}';
    }
}

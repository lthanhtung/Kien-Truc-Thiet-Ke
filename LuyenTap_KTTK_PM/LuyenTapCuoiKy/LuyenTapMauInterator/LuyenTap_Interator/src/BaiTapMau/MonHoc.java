package BaiTapMau;

public class MonHoc {
    String Ten;
    int tc;

    public MonHoc(String ten, int tc) {
        Ten = ten;
        this.tc = tc;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "Ten='" + Ten + '\'' +
                ", tc=" + tc +
                '}';
    }
}

package behavioral_pattern.Observer_pattern.CA1;

public class MonHoc {
    String id,ten;
    int SoTC;

    public MonHoc(String id, String ten, int soTC) {
        this.id = id;
        this.ten = ten;
        SoTC = soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", SoTC=" + SoTC +
                '}';
    }

}

package CA3;

public class MainCA3 {
    public static void main(String[] args) {
        TiGia a = new TiGia();
        NhaDauTuA b = new NhaDauTuA(a);
        NhaDauTuB c = new NhaDauTuB(a);
        b.DangKy();
        a.Notyfi(5);
        System.out.println("----------------");
        c.DangKy();
        a.Notyfi(5);
        b.Remove();
        a.Notyfi(5);
    }
}

package CB1;

public class MainCB1 {
    public static void main(String[] args) {
        MenhGia b = new MenhGiaThap(50);
        MenhGia c = new MenhGiaThap(10);
        MenhGia g = new MenhGiaCaoNhat(1);
        b.KeTiep(c).KeTiep(g);
        b.inmenhgia(293);
    }
}

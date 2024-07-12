package behavioral_pattern.Chain_of_Responsibility.CB1_a;

public class Main {
    public static void main(String[] args) {
        // 500, 100, 50 , 10, 1
        MenhGia NamTram = new MenhGia(500);
        MenhGia Tram = new MenhGia(100);
        MenhGia NamChuc = new MenhGia(50);
        MenhGia Muoi = new MenhGia(10);
        MenhGiaThapNhat Mot = new MenhGiaThapNhat(1);
        NamTram.keTiep(Tram).keTiep(NamChuc).keTiep(Muoi).keTiep(Mot);
        NamTram.rutTien(502);

    }
}

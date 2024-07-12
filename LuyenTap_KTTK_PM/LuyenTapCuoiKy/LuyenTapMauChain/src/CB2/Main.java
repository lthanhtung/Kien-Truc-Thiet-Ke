package CB2;

public class Main {
    public static void main(String[] args) {
        ChucVu PhoTruongPhong = new ChucVuThap("Phó trưởng phòng",2000);
        ChucVu TruongPhong = new ChucVuThap("Trưởng phòng",3000);
        ChucVu GiamDoc = new ChucVuThap("Giám đốc",3500);
        ChucVu ChuTich = new ChucVuCaoNhat("Chủ tịch",4000);
        PhoTruongPhong.ketiep(TruongPhong).ketiep(GiamDoc).ketiep(ChuTich);
        PhoTruongPhong.ChoVay(2000);
        System.out.println("-------------------");
        PhoTruongPhong.ChoVay(2500);
        System.out.println("-------------------");
        PhoTruongPhong.ChoVay(3500);
        System.out.println("-------------------");
        PhoTruongPhong.ChoVay(4000);
        System.out.println("-------------------");
        PhoTruongPhong.ChoVay(4500);
    }
}

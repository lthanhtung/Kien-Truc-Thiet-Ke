package Decorator_pattern.B1;

public class BieuThucDonGian extends BieuThuc {
    float ToanHang;

    public BieuThucDonGian(float toanHang) {
        ToanHang = toanHang;
    }

    @Override
    public float GiaTri() {
        return ToanHang;
    }

    @Override
    public String BieuThuc() {
        return null;
    }
}

package Decorator_pattern.B1;

public class Tru extends BieuThucDecorator{
    float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float GiaTri() {
        return bieuThuc.GiaTri() - this.toanHang;
    }

    @Override
    public String BieuThuc() {
        return "-";
    }

    @Override
    public String toString() {
        return bieuThuc.GiaTri() +" " + BieuThuc() + toanHang +"=" + GiaTri();
    }
}

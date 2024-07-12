package Decorator_pattern.B1;

public class Nhan extends BieuThucDecorator{
    int toanHang;

    public Nhan(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float GiaTri() {
        return bieuThuc.GiaTri() * this.toanHang;
    }

    @Override
    public String BieuThuc() {
        return "*";
    }

    @Override
    public String toString() {
        return bieuThuc.GiaTri() +" " + BieuThuc() + toanHang +"=" + GiaTri();
    }

}

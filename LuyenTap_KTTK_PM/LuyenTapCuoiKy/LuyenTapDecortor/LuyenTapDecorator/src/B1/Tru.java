package B1;

public class Tru extends BieuThucDecorator{
    float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float GiaTri() {
        return super.GiaTri() - this.toanHang;
    }

    @Override
    public String bieuThuc() {
        StringBuilder builder = new StringBuilder();
       // builder.append(bieuThuc.GiaTri()).append("-").append(this.toanHang).append("=").append(GiaTri());
        builder.append("-").append(toanHang);
        return bieuThuc.bieuThuc() + builder;
    }

}

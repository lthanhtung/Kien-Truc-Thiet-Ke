package B1;

public class Cong extends BieuThucDecorator{
    float toanHang;

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float GiaTri() {
        return super.GiaTri() + this.toanHang;
    }

    @Override
    public String bieuThuc() {
        //StringBuilder builder = new StringBuilder();
        //builder.append(bieuThuc.GiaTri()).append("+").append(this.toanHang).append("=").append(GiaTri());
       // builder.append("+").append(this.toanHang);
       // return bieuThuc.bieuThuc() + builder;
        return bieuThuc.bieuThuc() + "+" + this.toanHang;
    }
}

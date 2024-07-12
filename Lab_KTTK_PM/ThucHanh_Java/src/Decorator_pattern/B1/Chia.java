package Decorator_pattern.B1;

public class Chia extends BieuThucDecorator{
    float toanHang;

    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float GiaTri() {
        return bieuThuc.GiaTri() / this.toanHang;
    }

    @Override
    public String BieuThuc() {
        StringBuilder builder = new StringBuilder();
        builder.append("/");
        if(toanHang<0) builder.append("(").append(toanHang).append(")");
        else builder.append(toanHang);
        return "("+bieuThuc.BieuThuc()+")" + builder;
    }
}

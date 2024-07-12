package Decorator_pattern.B1;

public class GiaTriTuyetDoi extends BieuThucDecorator{


    public GiaTriTuyetDoi(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float GiaTri() {
        if (bieuThuc.GiaTri() > 0) {
            return bieuThuc.GiaTri();
        }
        else return bieuThuc.GiaTri() * (-1);

    }

    @Override
    public String BieuThuc() {
        return super.BieuThuc();
    }
}

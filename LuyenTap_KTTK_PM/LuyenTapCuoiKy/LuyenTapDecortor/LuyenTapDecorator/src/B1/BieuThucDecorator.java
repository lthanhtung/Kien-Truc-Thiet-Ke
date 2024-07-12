package B1;

public class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public float GiaTri() {
        return bieuThuc.GiaTri();
    }

    @Override
    public String bieuThuc() {
        return null;
    }
}

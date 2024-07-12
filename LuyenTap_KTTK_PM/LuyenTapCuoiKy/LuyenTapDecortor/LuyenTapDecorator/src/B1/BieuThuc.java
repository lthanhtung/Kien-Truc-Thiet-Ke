package B1;

public abstract class BieuThuc {
    public abstract float GiaTri();
    public abstract String bieuThuc();
    @Override
    public String toString() {
        return bieuThuc() + " = " + GiaTri();
    }
}

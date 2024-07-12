package B1;

public class BieuThucDonGian extends BieuThuc{
    float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float GiaTri() {
        return toanHang;
    }

    @Override
    public String bieuThuc() {
        //StringBuilder builder = new StringBuilder();
      //  builder.append(this.toanHang);
        return ""+toanHang;
    }
}

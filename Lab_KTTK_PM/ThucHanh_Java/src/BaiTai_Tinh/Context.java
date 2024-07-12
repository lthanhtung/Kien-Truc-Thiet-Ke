package BaiTai_Tinh;

public class Context {
   private ITinh tinh;

    public Context setTinh(ITinh tinh) {
        this.tinh = tinh;
        return this;
    }
    public float tinh(float a, float b)
    {
        return tinh.tinh(a,b);
    }

}

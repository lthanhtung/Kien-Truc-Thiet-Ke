package CB1;

public class MenhGiaCaoNhat extends MenhGia{
    int menhgia;

    public MenhGiaCaoNhat(int menhgia) {
        this.menhgia = menhgia;
    }

    @Override
    public void inmenhgia(int sotien) {
        if (sotien % menhgia == 0)
        {
            System.out.println("Số tờ "+ menhgia + "đổi được:"+ sotien / menhgia);
        }
    }

    @Override
    public CB1.MenhGia KeTiep(MenhGia menhgia) {
        return null;
    }
}

package CB1;

public class MenhGiaThap extends MenhGia{
    int MenhGia;
    MenhGia ketiep;

    public MenhGiaThap(int menhGia) {
        MenhGia = menhGia;
    }

    @Override
    public void inmenhgia(int sotien) {
        if (sotien % MenhGia == 0)
        {
            System.out.println("Số tờ "+ MenhGia + "đổi được:"+ sotien / MenhGia);
        }
        else{
            System.out.println("Số tờ "+ MenhGia + "đổi được:"+ sotien / MenhGia);
            ketiep.inmenhgia(sotien - sotien/MenhGia);
        }
    }

    @Override
    public MenhGia KeTiep(MenhGia menhgia) {
        ketiep = menhgia;
        return ketiep;
    }
}

package LuyenTapSingleTon.BaiTap;

public class User {
    String id;

    public User(String id) {
        this.id = id;
    }

    public void vote(UngVien ungVien) {
        Election.getInstance().Vote(ungVien, this.id);
    }

}

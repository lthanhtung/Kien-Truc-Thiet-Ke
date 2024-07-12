package LuyenTapSingleTon.BaiTap;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Thanh");
        User user2 = new User("Tu");
        User user3 = new User("Thao");
        user1.vote(UngVien.Donal_Trum);
        user2.vote(UngVien.Job_Biden);
        user3.vote(UngVien.Donal_Trum);

       Election.getInstance().KetQuaBauChon();
    }
}

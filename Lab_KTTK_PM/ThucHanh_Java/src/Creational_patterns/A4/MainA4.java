package Creational_patterns.A4;

public class MainA4 {
    public static void main(String[] args) {


        User Luan = new User("Luan");
        User Phong = new User("Phong");
        User Minh = new User("Minh");
        User Anh = new User("Anh");
        User Tuyet = new User("Tuyet");

        Luan.vote(Candidate.DONAL_TRUMP);
        Phong.vote(Candidate.JOE_BIDEN);
        Minh.vote(Candidate.DONAL_TRUMP);
        Anh.vote(Candidate.DONAL_TRUMP);
        Tuyet.vote(Candidate.DONAL_TRUMP);
        Election.getInstance().kq();

    }
}

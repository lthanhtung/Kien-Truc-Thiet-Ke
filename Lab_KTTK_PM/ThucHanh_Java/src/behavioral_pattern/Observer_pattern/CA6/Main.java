package behavioral_pattern.Observer_pattern.CA6;

public class Main {
    public static void main(String[] args) {
    PlayerData pl1 = new PlayerData("24 phút",122,70);
    Dashboard dashboard = new Dashboard();
    dashboard.Hienthi(pl1);
        System.out.println("---------------------------------------");
    pl1.setThoigian("22");
    pl1.setCountDown(12);
    pl1.setGrade(3);
    dashboard.Hienthi(pl1);

    }
}

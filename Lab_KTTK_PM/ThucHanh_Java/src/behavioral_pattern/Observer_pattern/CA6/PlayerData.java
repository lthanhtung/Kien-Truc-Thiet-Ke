package behavioral_pattern.Observer_pattern.CA6;

import java.util.ArrayList;
import java.util.List;

public class PlayerData implements PlayerDataObserver {

    PlayerDataObserver listenner;
    List<PlayerDataObserver> dataPlayer = new ArrayList<>();
    String thoigian;
    int CountDown;
    int grade;

    public PlayerData(String thoigian, int countDown, int grade) {
        this.thoigian = thoigian;
        CountDown = countDown;
        this.grade = grade;
    }
    public void ThemNguoiChoi(PlayerData data)
    {
        dataPlayer.add(data);
    }
    public void XoaNguoiChoi(PlayerData data)
    {
        dataPlayer.remove(data);
    }
    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;

    }

    public void setCountDown(int countDown) {
        CountDown = countDown;
        listenner.CapNhap(this);
    }

    public void setGrade(int grade) {
        this.grade = grade;
        listenner.CapNhap(this);
    }

    @Override
    public void CapNhap(PlayerData data) {
        data.setGrade(data.grade);
        data.setThoigian(data.thoigian);
        data.setCountDown(data.CountDown);
    }
}

package behavioral_pattern.Observer_pattern.CA6;

import java.util.List;

public class Dashboard {
    //sujetc chứa đại diện obsever
    //observer chứa subject
    public void Hienthi(PlayerData observer)
    {
        System.out.println(observer.thoigian);
        System.out.println(observer.CountDown);
        System.out.println(observer.grade);
    }


}

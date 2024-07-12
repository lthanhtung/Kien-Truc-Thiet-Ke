package LuyenTapSingleTon.BaiTap;

import java.util.ArrayList;
import java.util.List;

public class Election {
    //1 Tạo 1 biến sẽ là Singleton: biến sẽ là private static
    private static Election instance;

    int voteTrum = 0;
    int voteBiden = 0;
    List<String> user = new ArrayList<>();
    //Hàm thiết lập phải là private or protected
    private Election() {
    }
    public static Election getInstance()
    {
        if (instance == null)
        {
            instance = new Election();
        }
        return instance;
    }
    public void Vote(UngVien ungVien, String UserId)
    {
        for (String id:user)
            if (id.equals(UserId))
                return;

        if (ungVien == UngVien.Donal_Trum)
        {
            voteTrum++;
            user.add(UserId);
        }
        else {
            voteBiden++;
            user.add(UserId);
        }
    }

    public void KetQuaBauChon()
    {
        System.out.println("Số phiếu bầu của Donal Trum:"+voteTrum);
        System.out.println("Số phiếu bầu của Job Biden:"+ voteBiden);
    }




}

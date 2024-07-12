package BaiTapMau_L2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIteratorC2 {
    public static void DuyetPhanTu(Iterator<MonHoc> iterator) {
    while (iterator.hasNext()){
        MonHoc monHoc = iterator.next();
        System.out.println(monHoc.toString());
    }
    }

    public static void main(String[] args) {
        List<MonHoc> monHocList = new ArrayList<>(Arrays.asList(
                new MonHoc("Toán",4),
                new MonHoc("Văn",5)
        ));
        DuyetPhanTu(monHocList.iterator());
    }
}

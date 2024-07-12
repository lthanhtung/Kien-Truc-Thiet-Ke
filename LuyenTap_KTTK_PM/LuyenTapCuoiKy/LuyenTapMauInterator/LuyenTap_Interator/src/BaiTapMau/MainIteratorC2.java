package BaiTapMau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIteratorC2 {
/*
Đối với cách 2:
- Sau khi tạo xong hàm cấu trúc cho đối tượng thù chúng ta bắt đầu tạo 1 hàm để duyệt phần tử
- Hàm này phải là static và tham số truyền vào sẽ là 1 Iterator<Lớp cấu trúc>
- Trong điều kiện duyệt phần tử sẽ phải tạo 1 đối tượng của Lớp cấu trúc
và cho Iterator lấy dữ liệu trong đối tượng.
- Sau khi lấy được dữ liệu sẽ bắt đầu sử lý yêu cầu
- Sau đó sẽ viết hàm main giống với cách 1 nhưng chỉ khác là sẽ dùng hàm đã tạo để duyệt phần tử.
 */

    public static void duyetPhanTu(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()){
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }


    public static void main(String[] args) {
        List<MonHoc> monHocList = new ArrayList<MonHoc>(Arrays.asList(
                new MonHoc("Toán",4),
                new MonHoc("Văn",6)
        ));
        duyetPhanTu(monHocList.iterator());
    }
}

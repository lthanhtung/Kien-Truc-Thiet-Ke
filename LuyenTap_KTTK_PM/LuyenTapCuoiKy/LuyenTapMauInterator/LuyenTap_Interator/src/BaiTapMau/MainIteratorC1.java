package BaiTapMau;
/*
Định nghĩa mẫu Iterator sẽ chịu trách nhiệm duyệt các phần tử trong tập hơp.
Tập có thể là 1 List, Mảng hoặc 1 tập hợp do người dùng quy định
Mẫu iterator được java hỗ trợ với class có tên là iterator bao gồm 2 phương thức chính:
hastNext() và Next
hastNext(): Chịu trách nhiệm duyệt các phần tử có trong mảng
Next(): Chịu trách nhiệm lấy giá trị của các phần tử đã được duyệt
--------------------
Các Phương pháp làm:
- Phương pháp 1: Duyệt 1 mảng có sẵn
- Phương pháp 2: Duyệt 1 tệp có sẵn.
- Phương pháp 3: Duyệt 1 tập hợp do người dùng định nghĩa. Cách này khó vì phải người dùng phải tự
các iterator.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIteratorC1 {
/*
-- Đối với cách 1:
- Tạo 1 List<Kiểu dữ liệu> = khởi tạo mảng mà add phần tử vào
- Tạo iterator trùng với kiểu dữ liệu mảng và add iterator cho list
- Thiết lập điều kiện dừng cho iterator và sử lý yêu cầu bên trong điều kiện dừng
 */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));// Khởi tạo list và add phần tử
        Iterator<Integer> iterator = list.iterator(); // Tạo iterator và add cho list
        //Thiết lập điều kiện dừng và xử lý yêu cầu
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}

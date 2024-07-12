package behavioral_pattern.Observer_pattern.CA1;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
        MyClientGeneric<List<MonHoc>> client = new MyClientGeneric<>(stream,
                monHocs -> {
                    for (MonHoc monHoc : monHocs) {
                        System.out.println(monHoc.toString());
                    }
                });
        System.out.println("Lần 1");
        dataAccess.add(new MonHoc("01","The duc",3));
        System.out.println("lần 2");
        dataAccess.add(new MonHoc("02","Giáo dục",5));

    }
}

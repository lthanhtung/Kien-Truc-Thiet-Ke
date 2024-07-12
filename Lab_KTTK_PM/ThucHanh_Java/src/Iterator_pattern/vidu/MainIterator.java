package Iterator_pattern.vidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void duyetMonHOC(Iterator<MOnhoc> iterator){
        while (iterator.hasNext())
        {
            MOnhoc mOnhoc = iterator.next();
            System.out.println(mOnhoc.toString());
        }
    }



    public static void main(String[] args) {
        // th1: duyệt mảng có sẵn
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        List<MOnhoc> monHocList = new ArrayList<>(Arrays.asList(
                new MOnhoc("MOn1",1),
                new MOnhoc("MOn2",1)

    ));
        duyetMonHOC(monHocList.iterator());
    }
}

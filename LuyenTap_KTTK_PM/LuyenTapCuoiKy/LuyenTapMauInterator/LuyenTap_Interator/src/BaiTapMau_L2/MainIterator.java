package BaiTapMau_L2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;




public class MainIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

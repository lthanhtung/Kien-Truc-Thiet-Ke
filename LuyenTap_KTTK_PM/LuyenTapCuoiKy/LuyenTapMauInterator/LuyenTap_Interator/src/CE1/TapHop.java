package CE1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TapHop {
    List<Integer> listSoNguyen = new ArrayList<>(Arrays.asList(
            1,2,3,4,5,6,7,8,9,0
    ));
    Iterator<Integer> iterator = listSoNguyen.iterator();
    public void Getitem(int i){
        while (iterator.hasNext()){
            if (iterator.next() == i){
                System.out.println(iterator.next());
            }
        }

    }
    public int count(){
        return listSoNguyen.size();
    }

}

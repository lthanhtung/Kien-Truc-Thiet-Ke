package B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu extends Tokenize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    List<String> tokenize() {
        String[] token = s.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(token));
        return list;
    }
}

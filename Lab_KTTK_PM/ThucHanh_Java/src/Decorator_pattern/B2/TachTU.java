package Decorator_pattern.B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTU implements Tokennize{
    String s;

    public TachTU(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenzize() {
        String[] token = s.split(" ");
        List<String> list = new ArrayList<String>(Arrays.asList(token));
        return list;

    }

}

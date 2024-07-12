package B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTuTheoDau extends TokennizeDecorator{
    ArrayList<String> TachDau;
    public TachTuTheoDau(Tokenize tokenize) {
        super(tokenize);
        TachDau = new ArrayList<>(Arrays.asList(";","?"));
    }

    @Override
    List<String> tokenize() {
        List<String> list = tokenize.tokenize();
        list.removeAll(TachDau);
        return list;
    }
}

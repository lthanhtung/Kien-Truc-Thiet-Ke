package B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTuTheoTuDung extends TokennizeDecorator{
    ArrayList<String> TuDung;

    public TachTuTheoTuDung(Tokenize tokenize) {
        super(tokenize);
        TuDung = new ArrayList<>(Arrays.asList("và","hoặc","thì","là","mà"));

    }

    @Override
    List<String> tokenize() {
        List<String> list = tokenize.tokenize();
        list.removeAll(TuDung);
        return list;
    }
}

package Decorator_pattern.B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopWord extends TokenDecorator{
    ArrayList stopword;
    public RemoveStopWord(Tokennize token) {
        super(token);
        stopword = new ArrayList(Arrays.asList("và","thì","mà","là","nhưng","được"));
    }

    @Override
    public List<String> tokenzize() {
        List<String> list = token.tokenzize();
        list.removeAll(stopword);
        return list;
    }
}

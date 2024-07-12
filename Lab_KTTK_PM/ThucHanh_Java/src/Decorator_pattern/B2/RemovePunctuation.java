package Decorator_pattern.B2;

import java.util.List;

public class RemovePunctuation extends TokenDecorator{
    public RemovePunctuation(Tokennize token) {
        super(token);
    }

    @Override
    public List<String> tokenzize() {
        List<String> list = token.tokenzize();
        list.replaceAll(s -> s.replaceAll("\\p{Punct}",""));
        return list;
    }
}

package B2;

public abstract class TokennizeDecorator extends Tokenize{
    Tokenize tokenize;

    public TokennizeDecorator(Tokenize tokenize) {
        this.tokenize = tokenize;
    }

}

package Decorator_pattern.B2;

public abstract class TokenDecorator implements Tokennize{
    Tokennize token;

    public TokenDecorator(Tokennize token) {
        this.token = token;
    }

}

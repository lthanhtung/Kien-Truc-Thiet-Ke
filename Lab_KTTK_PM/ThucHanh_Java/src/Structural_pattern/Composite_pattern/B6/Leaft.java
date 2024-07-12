package Structural_pattern.Composite_pattern.B6;

public class Leaft  extends BNote{
    public Leaft(int value) {
        super(value);
    }

    @Override
    public void AddL(BNote node) {

    }

    @Override
    public void AddR(BNote node) {

    }

    @Override
    public void RemoveL(BNote node) {

    }

    @Override
    public void RemoveR(BNote node) {

    }

    @Override
    public String travel() {
        StringBuilder builder = new StringBuilder();
        builder.append(value);
        return builder.toString();
    }
}

package Structural_pattern.Composite_pattern.B6;

public class InnerNode extends BNote{
    BNote left,right;

    public InnerNode(int value) {
        super(value);
    }

    @Override
    public void AddL(BNote node) {
        left = node;
    }

    @Override
    public void AddR(BNote node) {
        right = node;
    }

    @Override
    public void RemoveL(BNote node) {
        left = null;
    }

    @Override
    public void RemoveR(BNote node) {
        right = null;
    }


    @Override
    public String travel() {
        StringBuilder builder = new StringBuilder();

        builder.append(value);
        if (left != null) {
               left.p = this.p +"\t";
               builder.append("\n").append(left.p)
                       .append(left.travel());
               left.p ="";
        }
        if (right != null) {
            right.p = this.p +"\t";
            builder.append("\n").append(right.p)
                    .append(right.travel());
            right.p ="";
        }
        return builder.toString();
    }
}

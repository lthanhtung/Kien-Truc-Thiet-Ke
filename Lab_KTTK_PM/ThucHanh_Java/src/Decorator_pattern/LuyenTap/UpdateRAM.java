package Decorator_pattern.LuyenTap;

public class UpdateRAM extends Pcdecorator{
    String nRAM;
    int Value;

    public UpdateRAM(PC pc, String nRAM, int value) {
        super(pc);
        this.nRAM = nRAM;
        Value = value;
    }

    @Override
    public String getRAM() {
        return  super.getRAM() + " " + nRAM;
    }

    @Override
    public int getVRAM() {
        return super.getVRAM() + Value;
    }

    @Override
    String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("PC:" + pc.PC + "\n")
                .append("CPU:" + CPU + "\n")
                .append("storage:" + storage +"\n")
                .append("screen:" + screen + "\n")
                .append("Ram:"+ getRAM() + "\n")
                .append("Dung tích Ram:" + getVRAM());
        return builder.toString();
    }

    @Override
    int value() {
        return super.value();
    }
}

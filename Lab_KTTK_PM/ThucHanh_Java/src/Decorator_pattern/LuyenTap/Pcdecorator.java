package Decorator_pattern.LuyenTap;

public class Pcdecorator extends PC{
    PC pc;

    public Pcdecorator(Decorator_pattern.LuyenTap.PC pc) {
        this.pc = pc;
    }

    @Override
    public String getPC() {
        return super.getPC();
    }

    @Override
    public String getRAM() {
        return super.getRAM();
    }

    @Override
    public String getCPU() {
        return super.getCPU();
    }

    @Override
    public String getStorage() {
        return super.getStorage();
    }

    @Override
    public String getScreen() {
        return super.getScreen();
    }

    @Override
    public int getvCPU() {
        return super.getvCPU();
    }

    @Override
    public int getVRAM() {
        return super.getVRAM();
    }

    @Override
    public int getVstorage() {
        return super.getVstorage();
    }

    @Override
    String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("PC:" + getPC() + "\n")
                .append("CPU:" + getCPU() + "\n")
                .append("storage:" + getStorage() +"\n")
                .append("screen:" + getScreen() + "\n")
                .append("Ram:"+ getRAM() + "\n")
                .append("Dung tích Ram:" + getVRAM());
        return builder.toString();
    }

    @Override
    int value() {
        return pc.vCPU + pc.VRAM + pc.vstorage + pc.Screen;
    }
}

package Decorator_pattern.LuyenTap;

public class ConcreatePC extends PC{
    public ConcreatePC(String PC, String RAM, String CPU, String storage, String screen, int vCPU, int VRAM, int vstorage, int screen1) {
        this.PC = PC;
        this.RAM = RAM;
        this.CPU = CPU;
        this.storage = storage;
        this.screen = screen;
        this.vCPU = vCPU;
        this.VRAM = VRAM;
        this.vstorage = vstorage;
        Screen = screen1;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("PC:" + this.PC + "\n")
                .append("CPU:" + CPU + "\n")
                .append("storage:" + storage+ "\n")
                .append("screen:" + screen + "\n")
                .append("Ram:"+ RAM + "\n")
                .append("Dung tích Ram:" + VRAM);
        return builder.toString();
    }

    @Override
    int value() {
        return vCPU+vstorage+VRAM + Screen;
    }
}

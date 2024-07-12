package Decorator_pattern.LuyenTap;

public abstract class PC {
    String PC, RAM, CPU, storage, screen;
    int vCPU, VRAM, vstorage, Screen;
    abstract String build();
    abstract int value();

    public String getPC() {
        return PC;
    }

    public String getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public int getvCPU() {
        return vCPU;
    }

    public int getVRAM() {
        return VRAM;
    }

    public int getVstorage() {
        return vstorage;
    }
}

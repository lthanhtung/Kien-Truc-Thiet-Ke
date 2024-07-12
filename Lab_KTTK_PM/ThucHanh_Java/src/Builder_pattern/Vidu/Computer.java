package Builder_pattern.Vidu;

// 1. Lớp, khi tạo đối tượng phải khởi tạo nhiều thành phần

public class Computer {

    // 2. Khai báo các thành phần cần hỗ trợ việc tạo đối tượng
    private String CPU, RAM, storage, screen;

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    //4. Hàm khởi tạo
    protected Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    //3.thành phần builder
    public static class Builder {
        String CPU, RAM, storage, screen;
    public Builder addCPU(String CPU)
    {
        this.CPU = CPU;
        return this;
    }

    public Builder addRam(String RAM)
    {
        this.RAM = RAM;
        return this;
    }

    public Builder addstorage(String storage)
    {
        this.storage = storage;
        return this;
    }
    public Builder addScreen(String screen)
    {
        this.screen = screen;
        return this;
    }

    //5. phương thức tạo ra đối tượng computer
        public Computer build() {
            return new Computer(this);
        }
    }

}

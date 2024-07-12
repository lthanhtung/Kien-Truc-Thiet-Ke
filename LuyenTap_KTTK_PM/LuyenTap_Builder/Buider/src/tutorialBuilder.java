
// 1. Lớp khi tạo đối tượng phải khởi tạo nhiều thành phần
public class tutorialBuilder {
    //2. Khai báo các thành phần cần hỗ trợ cho việc tạo đối tượng
    private String CPU,RAM, storage, screen;

    //4.Hàm khởi tạo


    public tutorialBuilder(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    //3. Xây dựng Lớp thành phần builder
    public static class Builder{
        //Khai báo các thành phần cần build
        String CPU, RAM, storage, screen;
        public Builder addCPU(String CPU)
        {
            this.CPU = CPU;
            return this;
        }
        public Builder addRAM(String RAM)
        {
            this.RAM = RAM;
            return this;
        }
        public Builder addstorage(String Storage)
        {
            this.storage = Storage;
            return this;
        }
        public Builder addscreen(String Screen)
        {
            this.screen = Screen;
            return this;
        }


        //5 Phương thức tạo ra đối tượng computer
        public tutorialBuilder build()
        {
            return new tutorialBuilder(this);
        }

    }
}

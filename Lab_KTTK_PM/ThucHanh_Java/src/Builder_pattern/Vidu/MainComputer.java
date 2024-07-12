package Builder_pattern.Vidu;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("Intel")
                .addRam("5GB")
                .addstorage("1TB")
                .addScreen("16K HDR LCD").build();
        System.out.println(computer);
    }
}

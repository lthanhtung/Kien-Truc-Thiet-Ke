package Builder_pattern.A5;

public class Main_Book {
    public static void main(String[] args) {
        Book CreateBook = new Book.Buider()
                .addTacGia("Not Way")
                .addSoTrang("80")
                .addTuaDe("Việt Nam Say is do")
                .addChuong("Chương 1: Introduction to Vietnam")
                .addChuong(" Chương 2: How wonderful Vietnamese people are")
                .addChuong("Chương 3: Vietnamese people do it")
                .addChuong("Thanks for reading").build();

        System.out.println(CreateBook.toString());
    }
}

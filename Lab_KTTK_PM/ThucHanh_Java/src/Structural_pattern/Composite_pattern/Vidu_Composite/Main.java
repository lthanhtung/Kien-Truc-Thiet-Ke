package Structural_pattern.Composite_pattern.Vidu_Composite;

public class Main {
    public static void main(String[] args) {
        Folder OCung = new Folder("D:","20/1");
        Folder folder_HocTap = new Folder("HocThatVui", "20/02");
        Folder folder_XemPhim = new Folder("XemPhim", "10/05");
        OCung.add(folder_HocTap);
        OCung.add(folder_XemPhim);

        folder_HocTap.add(new File("Nhung","12/01"));
        folder_HocTap.add(new File("C++","10/01"));
        folder_HocTap.add(new File("JaValorant","01/01"));
        folder_HocTap.add(folder_XemPhim);

        folder_XemPhim.add(new File("Nhung","12/01"));
        folder_XemPhim.add(new File("C++","10/01"));
        folder_XemPhim.add(new File("JaValorant","01/01"));
        System.out.println(OCung.getStringTreeFolder());
    }
}

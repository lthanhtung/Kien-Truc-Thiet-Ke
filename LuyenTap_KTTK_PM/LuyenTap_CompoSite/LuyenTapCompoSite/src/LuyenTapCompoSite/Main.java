package LuyenTapCompoSite;

public class Main {
    public static void main(String[] args) {
        Foder Ocung = new Foder("Data(D:)","20/1");
        Foder TaiLieu = new Foder("TaiLieu","20/1");
        Foder Design = new Foder("DesignPattern","20/1");
        Foder LapTrinhjaVa = new Foder("Lap Trinh Java","20/1");
        Foder LapTrinhAndroid = new Foder("Laptrinhthietbididong","20/1");

        //them file
        Ocung.addItem(TaiLieu);
        TaiLieu.addItem(Design);
        TaiLieu.addItem(LapTrinhjaVa);
        TaiLieu.addItem(LapTrinhAndroid);
        Ocung.addItem(new File("NgonNguLapTrinh.pdf","20/7"));

        Design.addItem(new File("CreationalPattern.pptx","21/1"));
        Design.addItem(new File("StructuralPattern.pptx","29/7"));

        LapTrinhjaVa.addItem(new File("LapTrinhjavacoBan,doc","20/1"));
        LapTrinhjaVa.addItem(new File("LapTrinhJavaNangCao.pdf","19/1"));

        LapTrinhAndroid.addItem(new File("CoBan.pptx","10/1"));
        LapTrinhAndroid.addItem(new File("NangCao.pptx","7/1"));

        System.out.println(Ocung.getStringTreeFolder());

    }
}

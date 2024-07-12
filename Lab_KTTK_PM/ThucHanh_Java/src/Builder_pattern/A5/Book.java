package Builder_pattern.A5;

import java.util.ArrayList;
import java.util.List;

    public class Book {
        private String TuaDe, SoTrang,TacGia;
        List<String> DsChuong;

 //   @Override
//    public String toString() {
//        return "Book{" +
//                "TuaDe='" + TuaDe + '\'' +
//                ", SoTrang='" + SoTrang + '\'' +
//                ", TacGia='" + TacGia + '\'' +
//                ", DsChuong=" + DsChuong +
//                '}';
//    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TuaDe:").append(TuaDe).append("\n")
                .append("SoTrang:").append(SoTrang).append("\n")
                .append("Tác Giả").append(TacGia).append("\n");
        int i = 1 ;
        for (String c: DsChuong){
            builder.append("\t").append(i++).append(". ").append(c).append("\n");
        }
        return builder.toString();
    }


    public Book(Buider b)
    {
        this.TuaDe = b.TuaDe;
        this.SoTrang = b.SoTrang;
        this.TacGia = b.TacGia;
        this.DsChuong = b.dsChuong;
    }

    public  static class Buider
    {
        String TuaDe, SoTrang, TacGia;
        List<String> dsChuong = new ArrayList<>();

        public Buider addTuaDe(String TuaDe)
        {
            this.TuaDe = TuaDe;
            return this;
        }
        public Buider addSoTrang(String SoTrang)
        {
            this.SoTrang = SoTrang;
            return this;
        }
        public Buider addTacGia(String TacGia)
        {
            this.TacGia = TacGia;
            return this;
        }
        public Buider addChuong(String Chuong)
        {
            this.dsChuong.add(Chuong);
            return this;
        }

        public Book build()
        {
            return new Book(this);
        }

    }



}

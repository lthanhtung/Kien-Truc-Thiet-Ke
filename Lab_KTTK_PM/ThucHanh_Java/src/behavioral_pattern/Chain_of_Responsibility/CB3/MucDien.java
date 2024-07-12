package behavioral_pattern.Chain_of_Responsibility.CB3;

public class MucDien extends Electric{
    int Sotien;
    public MucDien(int gia, int min, int max, String bac) {
        super(gia, min, max, bac);
    }

    Electric bactren;
    @Override
    public void TienDien(int DiendaDung) {
        int tam = DiendaDung - Min;
        if ( DiendaDung >=Min && DiendaDung <=Max) {
            Sotien = tam * Gia;
            System.out.println(Bac + ":" + Min + "-->" + Max + ":" + tam * Gia);

        }

        else {
            this.bactren.TienDien(DiendaDung);
            System.out.println(Bac+":"+ Min+ "-->" + Max + ":" + DiendaDung * Gia);
        }
    }

    @Override
    public Electric BacTran(Electric e) {
        bactren = e;
        return bactren;
    }
}

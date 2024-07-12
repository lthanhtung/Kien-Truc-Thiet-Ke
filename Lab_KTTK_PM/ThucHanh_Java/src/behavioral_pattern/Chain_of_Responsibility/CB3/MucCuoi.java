package behavioral_pattern.Chain_of_Responsibility.CB3;

public class MucCuoi extends Electric{
    public MucCuoi(int gia, int min, int max, String bac) {
        super(gia, min, max, bac);
    }

    @Override
    public void TienDien(int DiendaDung) {
        int tam = DiendaDung - Min;
        if (DiendaDung > 400)   System.out.println(Bac+":"+ Min+ "-->" + Max + ":" + tam * Gia);
    }

    @Override
    public Electric BacTran(Electric e) {
        return null;
    }
}

package behavioral_pattern.Chain_of_Responsibility.CB3;

public abstract class Electric {
    int Gia;
    int Min, Max;
    String Bac;

    public Electric(int gia, int min, int max, String bac) {
        Gia = gia;
        Min = min;
        Max = max;
        Bac = bac;
    }

    public abstract void TienDien(int DiendaDung);
    public abstract Electric BacTran(Electric e);

}

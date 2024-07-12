package behavioral_pattern.Chain_of_Responsibility.CB3;

public class main {
    public static void main(String[] args) {
        MucDien bac1 = new MucDien(1806,0,50,"Bậc 1");
        MucDien bac2 = new MucDien(1866,51,100,"Bậc 2");
        MucDien bac3 = new MucDien(2267,101,200,"Bậc 3");
        MucDien bac4 = new MucDien(2729,201,300,"Bậc 4");
        MucDien bac5 = new MucDien(3050,301,400,"Bậc 5");
        MucCuoi bac6 = new MucCuoi(3151,401,1000,"Bậc 6");
        bac1.BacTran(bac2).BacTran(bac3).BacTran(bac4).BacTran(bac5).BacTran(bac6);
        bac1.TienDien(450);
        System.out.println("Tổng tiền:");
    }
}

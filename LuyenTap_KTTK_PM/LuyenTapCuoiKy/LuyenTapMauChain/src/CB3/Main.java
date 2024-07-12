package CB3;

public class Main {
    public static void main(String[] args) {
        CapBac bac1 = new BacThap(0,50,1860,"Bậc 1");
        CapBac bac2 = new BacThap(50,100,1860,"Bậc 2");
        CapBac bac3 = new BacThap(100,200,2167,"Bậc 3");
        CapBac bac4 = new BacThap(200,300,2729,"Bậc 4");
        CapBac bac5 = new BacThap(300,400,3050,"Bậc 5");
        CapBac bac6 = new BacCaoNhat(400,3151,"Bậc 6");
        bac1.bactren(bac2).bactren(bac3).bactren(bac4).bactren(bac5).bactren(bac6);
        bac1.TinhTienDien(450);
    }
}

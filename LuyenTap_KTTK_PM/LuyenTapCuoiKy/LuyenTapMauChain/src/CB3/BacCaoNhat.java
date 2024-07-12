package CB3;

public class BacCaoNhat extends CapBac{
    int Min, sotien;
    String Capbac;
    StringBuilder builder =new StringBuilder();

    public BacCaoNhat(int min, int sotien, String capbac) {
        Min = min;
        this.sotien = sotien;
        Capbac = capbac;
    }

    @Override
    public int TinhTienDien(int SoKW) {
            builder.append(this.Capbac).append(":").append(Min).append("=").append(sotien*SoKW);
            System.out.println(builder);
        return SoKW*sotien;
    }

    @Override
    public CapBac bactren(CapBac c) {
        return null;
    }
}

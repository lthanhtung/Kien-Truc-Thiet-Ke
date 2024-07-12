package CB3;

public class BacThap extends CapBac{
    int Min, Max, sotien;
    String Capbac;
    CapBac bactren;
    StringBuilder builder = new StringBuilder();

    public BacThap(int min, int max, int sotien, String capbac) {
        Min = min;
        Max = max;
        this.sotien = sotien;
        Capbac = capbac;
    }

    @Override
    public int TinhTienDien(int SoKW) {
        if (SoKW <= (Max-Min)){
            builder.append(this.Capbac).append(":").append(this.Min).append("-->").append(this.Max).append("=").append(sotien * SoKW);
            System.out.println(builder);
            return  sotien * SoKW;
        }
        else {
            builder.append(this.Capbac).append(":").append(this.Min).append("-->").append(this.Max).append("=").append((Max - Min) * sotien);
            System.out.println(builder);
            return (Max - Min) * sotien + this.bactren.TinhTienDien(SoKW - (Max - Min));
        }
    }

    @Override
    public CapBac bactren(CapBac c) {
        bactren = c;
        return bactren;
    }
}

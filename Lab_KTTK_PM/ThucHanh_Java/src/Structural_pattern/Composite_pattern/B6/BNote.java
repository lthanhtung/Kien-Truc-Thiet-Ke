package Structural_pattern.Composite_pattern.B6;

public abstract class BNote {
  int value;
  String p="";

    public BNote(int value) {
        this.value = value;
    }
    public abstract void AddL(BNote node);
    public abstract void AddR(BNote node);
    public abstract void RemoveL(BNote node);
    public abstract void RemoveR(BNote node);
    public abstract String travel ();

}

package Structural_pattern.Composite_pattern.B5;

import java.util.ArrayList;
import java.util.List;

public class Layout implements UIComponent{
    String ten;
    List<UIComponent> childrent = new ArrayList<>();
}

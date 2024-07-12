package Builder_pattern.A2;

public class MyStringBuilder {
    String s ="";
    public MyStringBuilder appendString(String sub)
    {
        s+= sub;
        return  this;
    }

    @Override
    public String toString() {
        return s;
    }
}

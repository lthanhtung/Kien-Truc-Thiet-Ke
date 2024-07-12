package CA2;

public class MainCA2 {
    public static void main(String[] args) {
        Activity a = new Activity();
        ConcreateButton b = new ConcreateButton(a);
        ConcreateButton c = new ConcreateButton(a);
        b.DangKy();
        c.DangKy();
        b.Click();
        c.Click();
        c.Click();
        b.Click();
    }
}

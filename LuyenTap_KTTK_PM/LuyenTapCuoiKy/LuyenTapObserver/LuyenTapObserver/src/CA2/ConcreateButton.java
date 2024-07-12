package CA2;

public class ConcreateButton extends ButtonObservre{
    Activity activity;

    public ConcreateButton(Activity activity) {
        this.activity = activity;
    }
    public void DangKy(){
        activity.Attach(this);
    }
    public void HuyDangKy(){
        activity.Detach(this);
    }

    @Override
    public void Click(){
        activity.onClick();
    }
}

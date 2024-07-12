package LuyenTapCompoSite;

public class File extends Component{
    public File(String ten, String ngaytao) {
        super(ten, ngaytao);
    }

    @Override
    public String getStringTreeFolder() {
        return this.ten;
    }

    @Override
    public void addItem(Component file) {

    }

    @Override
    public void removeItem(Component file) {

    }

    @Override
    public String getPath() {
        return super.getPath();
    }
}

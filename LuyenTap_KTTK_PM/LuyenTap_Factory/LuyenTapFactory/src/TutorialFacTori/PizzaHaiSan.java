package TutorialFacTori;

public class PizzaHaiSan extends Pizza{
    @Override
    void prepare() {
        stringBuilder.append("TOM, DAU, BOT");
    }

    @Override
    void bake() {

        stringBuilder.append("\n").append("120 do C");
    }

    @Override
    void cut() {
    stringBuilder.append("\n").append("dao");
    }

    @Override
    void box() {
        stringBuilder.append("\n").append("Giay");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

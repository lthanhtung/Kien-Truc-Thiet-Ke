package behavioral.strate;

public abstract class Duck {
    Iflyable flyable;
    IQuackable quackable;

    public void setFlyable(Iflyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(IQuackable quackable) {
        this.quackable = quackable;
    }

    public abstract void display();
    public void performQuack(){
        System.out.println(quackable.quack());
    }
    public void performFly()
    {
        System.out.println(flyable.Fly());
    }



}

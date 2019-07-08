package aruw.bean;

public abstract class Engine {

    private double hp;

    public abstract  double generatePower(double source);

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}

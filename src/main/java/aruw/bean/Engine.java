package aruw.bean;

public abstract class Engine {

    private double hp;

    public abstract  double generatePowerInCycle(int level);

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
